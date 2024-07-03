package miu.edu.deliverysystem.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.dto.address.AddressRequestDto;
import miu.edu.deliverysystem.dto.payment.PaymentRequestDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequestDto {
    private String contactNumber;
    private String customerName;
    private String email;
    private AddressRequestDto addressRequestDto;
    private PaymentRequestDto paymentRequestDto;
}
