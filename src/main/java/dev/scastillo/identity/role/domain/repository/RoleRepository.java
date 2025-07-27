package dev.scastillo.identity.role.domain.repository;

import dev.scastillo.identity.role.domain.model.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleRepository {
    List<Role> findAll();
    Optional<Role> findById(UUID id);
    Role save(Role role);
    void deleteById(UUID id);
}
