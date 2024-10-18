package com.example.application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sensors")
public class SensorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "sensor_value", nullable = false) // Use a different name for the database column
    private Double sensor_value;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SensorType sensorType;

    // Constructors
    public SensorEntity() {}

    public SensorEntity(String name, Double value, SensorType sensorType) {
        this.name = name;
        this.sensor_value = value;
        this.sensorType = sensorType;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return sensor_value;
    }

    public void setValue(Double value) {
        this.sensor_value = value;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }
}
