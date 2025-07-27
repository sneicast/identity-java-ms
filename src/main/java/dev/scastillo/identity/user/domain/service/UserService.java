package dev.scastillo.identity.user.domain.service;

import dev.scastillo.identity.user.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(UUID id);
    User createUser(User newUser);
    User updateUser(UUID id, User updateUser);
    void deleteUser(UUID id);
}
