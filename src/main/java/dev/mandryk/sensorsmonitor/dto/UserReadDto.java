package dev.mandryk.sensorsmonitor.dto;

import dev.mandryk.sensorsmonitor.model.Role;
import lombok.Value;

import java.util.Set;

@Value
public class UserReadDto {
    Long id;

    String username;

    String password;

    String email;

    Set<Role> roles;
}
