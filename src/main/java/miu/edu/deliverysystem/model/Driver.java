package miu.edu.deliverysystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="drivers")
@NoArgsConstructor
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message ="driverName can not be blank")
    private String driverName;
    @NotBlank(message = "email can not be blank")
    @Column(unique = true)
    private String email;
    private String phone;
    private String vehicleInfo;
    private boolean assigned;
    @OneToMany(mappedBy = "driver")
    List<Delivery> deliveryList;

    public Driver(String email, String driverName, String phone, String vehicleInfo) {
        this.email = email;
        this.driverName = driverName;
        this.phone = phone;
        this.vehicleInfo = vehicleInfo;
    }
}
