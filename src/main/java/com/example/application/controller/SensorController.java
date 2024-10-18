package com.example.application.controller;

import com.example.application.dto.SensorDto;
import com.example.application.entity.SensorEntity;
import com.example.application.mapper.SensorMapper;
import com.example.application.repository.SensorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorRepository sensorRepository;

    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping
    public List<SensorEntity> findAll() {
        List<SensorEntity> sensors = sensorRepository.findAll();
        sensors.forEach(sensor -> System.out.println("Fetched sensor: " + sensor.getName()));
        return sensors;
    }

    @PostMapping
    public SensorDto create(@RequestBody SensorEntity sensorEntity) {
        return SensorMapper.of(sensorRepository.save(sensorEntity));
    }

    @GetMapping("/{id}")
    public SensorEntity findById(@PathVariable Long id) {
        return sensorRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        sensorRepository.deleteById(id);
    }
}
