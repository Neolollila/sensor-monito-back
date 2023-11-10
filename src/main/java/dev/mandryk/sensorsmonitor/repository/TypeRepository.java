package dev.mandryk.sensorsmonitor.repository;

import dev.mandryk.sensorsmonitor.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
