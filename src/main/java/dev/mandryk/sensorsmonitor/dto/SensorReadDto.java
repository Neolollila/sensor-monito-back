package dev.mandryk.sensorsmonitor.dto;

import lombok.Value;

@Value
public class SensorReadDto {
    Long id;

    String name;

    String model;

    Integer rangeFrom;

    Integer rangeTo;

    String type;

    String unit;

    String location;

    String description;
}
