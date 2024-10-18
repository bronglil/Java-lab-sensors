package com.example.application.service;

import com.example.application.entity.SensorEntity;
import com.example.application.entity.SensorType;
import com.example.application.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    // Fetch all sensors
    public List<SensorEntity> findAll() {
        return sensorRepository.findAll();
    }

    // Fetch sensors by sensor type (e.g., TEMPERATURE, HUMIDITY)
    public List<SensorEntity> findBySensorType(SensorType sensorType) {
        return sensorRepository.findBySensorType(sensorType);
    }

    // Save a sensor
    public SensorEntity save(SensorEntity sensorEntity) {
        return sensorRepository.save(sensorEntity);
    }

    // Delete a sensor by id
    public void deleteById(Long id) {
        sensorRepository.deleteById(id);
    }

    public SensorEntity findById(Long id) {
        return sensorRepository.findById(id).orElse(null);
    }
}
