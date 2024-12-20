package com.example.application.repository;

import com.example.application.entity.SensorEntity;
import com.example.application.entity.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorRepository extends JpaRepository<SensorEntity, Long> {
    List<SensorEntity> findBySensorType(SensorType sensorType);
}