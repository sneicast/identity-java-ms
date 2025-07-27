package dev.scastillo.identity.role.domain.service;

import dev.scastillo.identity.role.domain.model.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(UUID id);
    Role createRole(Role newRole);
    Role updateRole(UUID id, Role updateRole);
    void deleteRole(UUID id);
}
