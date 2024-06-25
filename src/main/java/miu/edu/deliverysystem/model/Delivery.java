package miu.edu.deliverysystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="deliveries")
@NoArgsConstructor
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date deliveryDate;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    @ManyToOne
    @JoinColumn(name="driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name="hub_id")
    private DeliveryHub deliveryHub;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Delivery(Date deliveryDate, DeliveryStatus deliveryStatus, Driver driver, DeliveryHub deliveryHub, Customer customer) {
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
        this.driver = driver;
        this.deliveryHub = deliveryHub;
        this.customer = customer;
    }
}
