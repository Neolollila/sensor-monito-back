package dev.mandryk.sensorsmonitor.repository;

import dev.mandryk.sensorsmonitor.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
