package dev.mandryk.sensorsmonitor.controller;

import dev.mandryk.sensorsmonitor.model.Type;
import dev.mandryk.sensorsmonitor.repository.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/types")
@RequiredArgsConstructor
public class TypeController {
    private final TypeRepository typeRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public List<Type> findAll() {
        return typeRepository.findAll();
    }
}
