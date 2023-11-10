package dev.mandryk.sensorsmonitor.dto;

import lombok.Value;

@Value
public class SensorCreateEditDto {

    String name;

    String model;

    Integer rangeFrom;

    Integer rangeTo;

    String type;

    String unit;

    String location;

    String description;
}
