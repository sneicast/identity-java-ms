package dev.scastillo.identity.role.infrastructure.repository;

import dev.scastillo.identity.role.domain.model.Role;
import dev.scastillo.identity.role.domain.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
@AllArgsConstructor
public class JpaRoleRepository implements RoleRepository {

    private final SpringDataRoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Role> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
