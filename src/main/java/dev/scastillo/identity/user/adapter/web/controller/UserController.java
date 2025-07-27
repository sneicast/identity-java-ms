package dev.scastillo.identity.user.adapter.web.controller;

import dev.scastillo.identity.user.adapter.web.dto.UserCreateRequestDto;
import dev.scastillo.identity.user.adapter.web.dto.UserDto;
import dev.scastillo.identity.user.adapter.web.dto.UserUpdateRequestDto;
import dev.scastillo.identity.user.adapter.web.mapper.UserMapper;
import dev.scastillo.identity.user.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public UserDto CreateUser(@RequestBody UserCreateRequestDto usercreateRequestDto){
        return userMapper.toDto(userService.createUser(userMapper.toDomainCreate(usercreateRequestDto)));
    }
    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers().stream()
                .map(userMapper::toDto)
                .toList();
    }
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id) {
        return userMapper.toDto(userService.getUserById(java.util.UUID.fromString(id)));
    }
    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable String id, @RequestBody UserUpdateRequestDto userUpdateRequestDto
    ) {
        return userMapper.toDto(userService.updateUser(java.util.UUID.fromString(id), userMapper.toDomainUpdate(userUpdateRequestDto)));
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(java.util.UUID.fromString(id));
    }
}
