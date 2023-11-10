package dev.mandryk.sensorsmonitor.controller;

import dev.mandryk.sensorsmonitor.dto.SensorCreateEditDto;
import dev.mandryk.sensorsmonitor.dto.SensorReadDto;
import dev.mandryk.sensorsmonitor.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.notFound;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorController {
    private final SensorService sensorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SensorReadDto> findAll() {
        return sensorService.findAll();
    }

    @GetMapping("/{id}")
    public SensorReadDto findById(@PathVariable("id") Long id) {
        return sensorService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public SensorReadDto create(@RequestBody SensorCreateEditDto sensor) {
        return sensorService.create(sensor);
    }

    @PutMapping
    public SensorReadDto update(@RequestBody SensorReadDto sensor) {
        return sensorService.update(sensor)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return sensorService.delete(id)
                ? noContent().build()
                : notFound().build();
    }
}
