package dev.scastillo.identity.user.adapter.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserCreateRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Boolean status;
}
