package dev.mandryk.sensorsmonitor.repository;

import dev.mandryk.sensorsmonitor.model.Role;
import dev.mandryk.sensorsmonitor.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
