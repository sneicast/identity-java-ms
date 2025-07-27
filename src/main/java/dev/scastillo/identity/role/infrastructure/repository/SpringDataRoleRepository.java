package dev.scastillo.identity.role.infrastructure.repository;

import dev.scastillo.identity.role.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataRoleRepository extends JpaRepository<Role, UUID> {
}
