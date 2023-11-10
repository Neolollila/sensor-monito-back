package dev.mandryk.sensorsmonitor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 15)
    private String model;

    @Column(name = "range_from")
    private Integer rangeFrom;

    @Column(name = "range_to")
    private Integer rangeTo;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String unit;

    @Column(length = 40)
    private String location;

    @Column(length = 200)
    private String description;
}
