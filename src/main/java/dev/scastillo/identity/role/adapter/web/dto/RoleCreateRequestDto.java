package dev.scastillo.identity.role.adapter.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoleCreateRequestDto {
    private final String title;
    private final String description;
}
