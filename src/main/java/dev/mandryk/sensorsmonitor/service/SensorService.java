package dev.mandryk.sensorsmonitor.service;

import dev.mandryk.sensorsmonitor.dto.SensorCreateEditDto;
import dev.mandryk.sensorsmonitor.dto.SensorReadDto;
import dev.mandryk.sensorsmonitor.mapper.SensorCreateEditMapper;
import dev.mandryk.sensorsmonitor.mapper.SensorReadMapper;
import dev.mandryk.sensorsmonitor.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;
    private final SensorCreateEditMapper sensorCreateEditMapper;
    private final SensorReadMapper sensorReadMapper;

    @Transactional
    public SensorReadDto create(SensorCreateEditDto sensorDto) {
        return Optional.of(sensorDto)
                .map(entity -> sensorCreateEditMapper.fromSensorCreateEditDtoToSensor(sensorDto))
                .map(sensorRepository::save)
                .map(sensorReadMapper::fromSensorToSensorReadDto)
                .orElseThrow();
    }

    public List<SensorReadDto> findAll() {
        return sensorRepository.findAll().stream()
                .map(sensorReadMapper::fromSensorToSensorReadDto)
                .collect(Collectors.toList());
    }

    public Optional<SensorReadDto> findById(Long id) {
        return sensorRepository.findById(id)
                .map(sensorReadMapper::fromSensorToSensorReadDto);
    }
    @Transactional
    public Optional<SensorReadDto> update(SensorReadDto sensorDto) {
        return sensorRepository.findById(sensorDto.getId())
                .map(entity -> sensorReadMapper.fromSensorReadDtoToSensor(sensorDto))
                .map(sensorRepository::saveAndFlush)
                .map(sensorReadMapper::fromSensorToSensorReadDto);
    }
    @Transactional
    public boolean delete(Long id) {
        return sensorRepository.findById(id)
                .map(entity -> {
                    sensorRepository.delete(entity);
                    sensorRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
