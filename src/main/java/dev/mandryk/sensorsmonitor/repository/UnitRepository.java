package dev.mandryk.sensorsmonitor.repository;

import dev.mandryk.sensorsmonitor.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {
}
