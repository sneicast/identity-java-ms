package dev.scastillo.identity.user.application.service;

import dev.scastillo.identity.shared.utils.DateTimeUtils;
import dev.scastillo.identity.user.domain.model.User;
import dev.scastillo.identity.user.domain.repository.UserRepository;
import dev.scastillo.identity.user.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(UUID id) {
        User result = userRepository.findById(id).orElse(null);
        if(result == null) {
            throw new RuntimeException("User not found with id: " + id);
        }
        return result;
    }

    @Override
    public User createUser(User newUser) {
        newUser.setCreatedAt(DateTimeUtils.nowInColombia());
        newUser.setUpdatedAt(DateTimeUtils.nowInColombia());
        return userRepository.save(newUser);
    }

    @Override
    public User updateUser(UUID id, User updateUser) {
        User existingUser = this.getUserById(id);

        existingUser.setFirstName(updateUser.getFirstName());
        existingUser.setLastName(updateUser.getLastName());
        existingUser.setEmail(updateUser.getEmail());
        existingUser.setPhone(updateUser.getPhone());
        existingUser.setStatus(updateUser.getStatus());
        existingUser.setUpdatedAt(DateTimeUtils.nowInColombia());
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
