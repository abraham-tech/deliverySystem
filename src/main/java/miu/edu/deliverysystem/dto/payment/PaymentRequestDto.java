package miu.edu.deliverysystem.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDto {
    private BigDecimal amount;
    private LocalDate paymentDate;
}
