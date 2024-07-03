package miu.edu.deliverysystem.dto.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"deliveries"})
public class CustomerResponseDto {
    private String email;
    private String phone;
}
