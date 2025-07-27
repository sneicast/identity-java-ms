package dev.scastillo.identity.user.domain.repository;

import dev.scastillo.identity.user.domain.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(UUID id);
    User save(User user);
    void deleteById(UUID id);
}
