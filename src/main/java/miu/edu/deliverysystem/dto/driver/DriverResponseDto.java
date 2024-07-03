package miu.edu.deliverysystem.dto.driver;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.deliverysystem.model.Delivery;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class DriverResponseDto {
    private String driverName;
    private String phone;
    private boolean assigned;
    @JsonIgnore
    List<Delivery> deliveriesResponseDto;
}
