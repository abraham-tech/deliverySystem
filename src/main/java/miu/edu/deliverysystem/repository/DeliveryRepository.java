package miu.edu.deliverysystem.repository;

import miu.edu.deliverysystem.model.Customer;
import miu.edu.deliverysystem.model.Delivery;
import miu.edu.deliverysystem.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    List<Delivery> findAllByDriver(Driver driver);
    List<Delivery> findAllByCustomer(Customer customer);
}
