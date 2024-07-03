package miu.edu.deliverysystem.dto.deliveryhub;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HubResponseDto {
    private String hubName;
    private String contactPhone;
}
