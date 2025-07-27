package dev.scastillo.identity.role.adapter.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class RoleDto {
    private UUID id;
    private String title;
    private String description;

}
