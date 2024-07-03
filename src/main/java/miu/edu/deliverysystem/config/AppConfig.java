package miu.edu.deliverysystem.config;

import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;
import miu.edu.deliverysystem.model.Customer;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(
                new PropertyMap<Customer, CustomerResponseDto>() {
                    @Override
                    protected void configure() {
                        map().setEmail(source.getEmail());
                        map().setContactNumber(source.getContactNumber());
                    }
                }
        );

        return modelMapper;
    }
}
