package miu.edu.deliverysystem.dto.delivery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.model.DeliveryStatus;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryRequestDto {
    private LocalDate deliverDate;
    private DeliveryStatus status;
    private String email;
}
