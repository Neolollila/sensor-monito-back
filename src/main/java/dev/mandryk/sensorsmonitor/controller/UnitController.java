package dev.mandryk.sensorsmonitor.controller;

import dev.mandryk.sensorsmonitor.model.Unit;
import dev.mandryk.sensorsmonitor.repository.UnitRepository;
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
@RequestMapping("/units")
@RequiredArgsConstructor
public class UnitController {
    private final UnitRepository unitRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }
}
