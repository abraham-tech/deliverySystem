package miu.edu.deliverysystem.repository;

import miu.edu.deliverysystem.model.DeliveryHub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeliveryHubRepository extends JpaRepository<DeliveryHub, Long> {
    Optional<DeliveryHub> findByName(String name);
}
