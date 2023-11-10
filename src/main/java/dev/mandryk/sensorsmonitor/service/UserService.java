package dev.mandryk.sensorsmonitor.service;

import dev.mandryk.sensorsmonitor.dto.UserReadDto;
import dev.mandryk.sensorsmonitor.mapper.UserReadMapper;
import dev.mandryk.sensorsmonitor.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService{
        private final UserRepository userRepository;
        private final UserReadMapper userReadMapper;

        public List<UserReadDto> findAll() {
                return userRepository.findAll().stream()
                        .map(userReadMapper::fromUserToUserReadDto)
                        .collect(Collectors.toList());
        }
}
