package dev.scastillo.identity.role.adapter.web.controller;

import dev.scastillo.identity.role.adapter.web.dto.RoleCreateRequestDto;
import dev.scastillo.identity.role.adapter.web.dto.RoleDto;
import dev.scastillo.identity.role.adapter.web.dto.RoleUpdateRequestDto;
import dev.scastillo.identity.role.adapter.web.mapper.RoleMapper;
import dev.scastillo.identity.role.domain.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/roles")
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;
    private final RoleMapper roleMapper;

    @PostMapping
    public RoleDto createRole(@RequestBody RoleCreateRequestDto roleCreateRequestDto) {
        return roleMapper.toDto(roleService.createRole(roleMapper.toDomainCreate(roleCreateRequestDto)));
    }
    @GetMapping
    public List<RoleDto> getAllRoles() {
        return roleService.getAllRoles().stream()
                .map(roleMapper::toDto)
                .toList();
    }
    @GetMapping("/{id}")
    public RoleDto getRoleById(@PathVariable UUID id) {
        return roleMapper.toDto(roleService.getRoleById(id));
    }
    @PutMapping("/{id}")
    public RoleDto updateRole(@PathVariable UUID id, @RequestBody RoleUpdateRequestDto roleUpdateRequestDto) {
        return roleMapper.toDto(roleService.updateRole(id, roleMapper.toDomainUpdate(roleUpdateRequestDto)));
    }
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable UUID id) {
        roleService.deleteRole(id);
    }
}
