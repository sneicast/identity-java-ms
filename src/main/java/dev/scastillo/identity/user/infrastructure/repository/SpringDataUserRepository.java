package dev.scastillo.identity.user.infrastructure.repository;

import dev.scastillo.identity.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataUserRepository extends JpaRepository<User, UUID> {
}
