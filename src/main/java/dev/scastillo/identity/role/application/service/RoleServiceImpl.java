package dev.scastillo.identity.role.application.service;

import dev.scastillo.identity.role.domain.model.Role;
import dev.scastillo.identity.role.domain.repository.RoleRepository;
import dev.scastillo.identity.role.domain.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(UUID id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Role not found with id: " + id));
    }

    @Override
    public Role createRole(Role newRole) {
        return roleRepository.save(newRole);
    }

    @Override
    public Role updateRole(UUID id, Role updateRole) {
        Role existingRole = getRoleById(id);
        existingRole.setTitle(updateRole.getTitle());
        existingRole.setDescription(updateRole.getDescription());
        return roleRepository.save(existingRole);
    }

    @Override
    public void deleteRole(UUID id) {
        roleRepository.deleteById(id);
    }
}
