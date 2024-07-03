package miu.edu.deliverysystem.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.model.Address;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerAddressResponseDto {
    private String contactNumber;
    private Address address;
}
