package dev.mandryk.sensorsmonitor.mapper;

import dev.mandryk.sensorsmonitor.dto.SensorReadDto;
import dev.mandryk.sensorsmonitor.model.Sensor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SensorReadMapper {
    SensorReadDto fromSensorToSensorReadDto(Sensor sensor);
    Sensor fromSensorReadDtoToSensor(SensorReadDto sensorReadDto);
}
