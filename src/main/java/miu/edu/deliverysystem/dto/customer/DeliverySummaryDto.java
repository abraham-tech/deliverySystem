package miu.edu.deliverysystem.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.model.DeliveryStatus;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliverySummaryDto {
    private LocalDate deliveryDate;
    private DeliveryStatus status;
    private String driver;
}
