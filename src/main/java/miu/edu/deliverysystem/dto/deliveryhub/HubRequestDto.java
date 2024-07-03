package miu.edu.deliverysystem.dto.deliveryhub;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.model.Address;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HubRequestDto {
    private String hubName;
    private String contactPhone;
    private Address address;
}
