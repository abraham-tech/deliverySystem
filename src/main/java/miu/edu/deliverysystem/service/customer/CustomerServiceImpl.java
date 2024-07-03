package miu.edu.deliverysystem.service.customer;

import lombok.RequiredArgsConstructor;
import miu.edu.deliverysystem.dto.customer.CustomerRequestDto;
import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;
import miu.edu.deliverysystem.model.Customer;
import miu.edu.deliverysystem.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private final ModelMapper modelMapper;
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
        return Optional.empty();
    }

    @Override
    public Optional<CustomerResponseDto> addCustomer(CustomerRequestDto customerRequestDto) {
        return Optional.empty();
    }

    @Override
    public void deleteCustomer(String email) {

    }
}
