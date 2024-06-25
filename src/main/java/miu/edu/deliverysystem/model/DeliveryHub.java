package miu.edu.deliverysystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="deliveryhubs")
public class DeliveryHub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    @NotBlank(message = "hubName can not be blank")
    private String hubName;
    @NotBlank(message="contactPhone cannot be blank")
    private String contactPhone;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;

}
