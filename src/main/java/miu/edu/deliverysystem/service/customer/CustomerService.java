package miu.edu.deliverysystem.service.customer;

import miu.edu.deliverysystem.dto.customer.CustomerRequestDto;
import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;

import java.util.Optional;

public interface CustomerService {
    Optional<CustomerResponseDto> findByEmail(String email);
    Optional<CustomerResponseDto> updateCustomer(String email, CustomerRequestDto customerRequestDto);
    Optional<CustomerResponseDto> addCustomer(CustomerRequestDto customerRequestDto);
    void deleteCustomer(String email);
}
