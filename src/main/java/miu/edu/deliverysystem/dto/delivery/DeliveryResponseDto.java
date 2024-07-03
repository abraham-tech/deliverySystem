package miu.edu.deliverysystem.dto.delivery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.dto.customer.CustomerResponseDto;
import miu.edu.deliverysystem.dto.deliveryhub.HubResponseDto;
import miu.edu.deliverysystem.dto.driver.DriverResponseDto;
import miu.edu.deliverysystem.model.DeliveryStatus;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryResponseDto {
    private LocalDate deliveryDate;
    private DeliveryStatus status;
    private DriverResponseDto driver;
    private HubResponseDto deliveryHub;
    private CustomerResponseDto customer;
}
