package miu.edu.deliverysystem.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import miu.edu.deliverysystem.dto.customer.CustomerRequestDto;
import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;
import miu.edu.deliverysystem.service.customer.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> addCustomer(@Valid @RequestBody CustomerRequestDto customerRequestDto) {
        Optional<CustomerResponseDto> optionalCustomer = customerService.addCustomer(customerRequestDto);
        if(optionalCustomer.isPresent()) {
            return ResponseEntity.ok(optionalCustomer.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/{email}")
    public ResponseEntity<CustomerResponseDto> findByEmail(@PathVariable String email) {
        Optional<CustomerResponseDto> optionalCustomer = customerService.findByEmail(email);
        if(optionalCustomer.isPresent()) {
            return ResponseEntity.ok(optionalCustomer.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PatchMapping("/{name}")
    public ResponseEntity<CustomerResponseDto> updateCustomer(@PathVariable String name, @Valid @RequestBody CustomerRequestDto customer) {
        Optional<CustomerResponseDto> customerResponseDto = customerService.updateCustomer(name, customer);
        if (customerResponseDto.isPresent()) {
            return ResponseEntity.ok(customerResponseDto.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<CustomerResponseDto> deleteCustomer(@PathVariable String name) {
        customerService.deleteCustomer(name);
        return ResponseEntity.ok().build();
    }

}
