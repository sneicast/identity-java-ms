package dev.scastillo.identity.role.adapter.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoleUpdateRequestDto {
    private final String title;
    private final String description;
}
