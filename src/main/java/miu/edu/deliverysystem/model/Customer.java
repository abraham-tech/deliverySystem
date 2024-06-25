package miu.edu.deliverysystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name="customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    @Column(unique = true)
    @NotBlank(message="email can not be blank")
    private String email;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy = "customer")
    List<Delivery> deliveryList;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="payment_id")
    private Payment payment;

    public Customer(String name, Address address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
}
