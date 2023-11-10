package dev.mandryk.sensorsmonitor.mapper;

import dev.mandryk.sensorsmonitor.dto.SensorCreateEditDto;
import dev.mandryk.sensorsmonitor.model.Sensor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SensorCreateEditMapper {
    SensorCreateEditDto fromSensorToSensorCreateEditDto(Sensor sensor);
    Sensor fromSensorCreateEditDtoToSensor(SensorCreateEditDto sensorCreateEditDto);

}
