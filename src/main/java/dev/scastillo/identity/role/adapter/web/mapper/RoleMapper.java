package dev.scastillo.identity.role.adapter.web.mapper;

import dev.scastillo.identity.role.adapter.web.dto.RoleCreateRequestDto;
import dev.scastillo.identity.role.adapter.web.dto.RoleDto;
import dev.scastillo.identity.role.adapter.web.dto.RoleUpdateRequestDto;
import dev.scastillo.identity.role.domain.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toDomainCreate(RoleCreateRequestDto dto);
    Role toDomainUpdate(RoleUpdateRequestDto dto);
    RoleDto toDto(Role role);
}
