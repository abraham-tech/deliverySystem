package miu.edu.deliverysystem.service.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import miu.edu.deliverysystem.dto.customer.CustomerDeliveryResponseDto;
import miu.edu.deliverysystem.dto.customer.CustomerRequestDto;
import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;
import miu.edu.deliverysystem.model.Customer;
import miu.edu.deliverysystem.model.Role;
import miu.edu.deliverysystem.model.User;
import miu.edu.deliverysystem.repository.CustomerRepository;
import miu.edu.deliverysystem.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;
    private Logger logger = LoggerFactory.getLogger(CustomerService.class);
    private final UserRepository userRepository;

    @Override
    public Optional<CustomerResponseDto> findByEmail(String email) {
        Optional<Customer>  customer = customerRepository.findByEmail(email);
        if (customer.isPresent()) {
            CustomerResponseDto customerResponseDto = modelMapper.map(customer.get(), CustomerResponseDto.class);
            return Optional.of(customerResponseDto);
        }
        return Optional.empty();
    }


    @Override
    public Optional<CustomerResponseDto> updateCustomer(String email, CustomerRequestDto customerRequestDto) {
        Optional<Customer>  customer = customerRepository.findByEmail(email);
        if (customer.isPresent()) {
            modelMapper.map(customerRequestDto, customer.get());
            Customer savedCustomer = customerRepository.save(customer.get());
            CustomerResponseDto customerResponseDto = modelMapper.map(savedCustomer, CustomerResponseDto.class);
            return Optional.of(customerResponseDto);
        }
        return Optional.empty();
    }

    @Override
    public Optional<CustomerResponseDto> addCustomer(CustomerRequestDto customerRequestDto) {
        User user = new User(customerRequestDto.getCustomerName(), customerRequestDto.getCustomerName(),
                customerRequestDto.getEmail(),
                Role.MEMBER);
        userRepository.save(user);
        logger.info("Customer created");
        Customer customer = modelMapper.map(customerRequestDto, Customer.class);
        Customer savedCustomer = customerRepository.save(customer);
        logger.info("Customer saved: {}", savedCustomer);
        CustomerResponseDto customerResponseDto = modelMapper.map(savedCustomer, CustomerResponseDto.class);
        return Optional.of(customerResponseDto);
    }

    @Override
    public void deleteCustomer(String email) {
        Optional<Customer>  customer = customerRepository.findByEmail(email);
        if (customer.isPresent()) {
            customerRepository.delete(customer.get());
        }
    }

    @Override
    public Optional<CustomerDeliveryResponseDto> placeOrder(String email, String expectedDate) {
        return Optional.empty();
    }

    @Override
    public Optional<List<CustomerResponseDto>> addAllCustomers(List<CustomerRequestDto> customerRequestDtos) {
        return Optional.empty();
    }

    @Override
    public Page<CustomerResponseDto> findAll(int pageNumber, int pageSize, String direction, String sortBy) {
        return null;
    }
}
