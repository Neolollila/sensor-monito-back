package dev.mandryk.sensorsmonitor.mapper;

import dev.mandryk.sensorsmonitor.dto.UserReadDto;
import dev.mandryk.sensorsmonitor.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserReadMapper {
    UserReadDto fromUserToUserReadDto(User user);

    User fromUserReadDtoToUser(UserReadDto userReadDto);
}
