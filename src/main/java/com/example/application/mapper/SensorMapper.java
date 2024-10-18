package com.example.application.mapper;

import com.example.application.dto.SensorDto;
import com.example.application.entity.SensorEntity;

public class SensorMapper {
    public static SensorDto of(SensorEntity entity) {
        return new SensorDto(
                entity.getId(),
                entity.getName(),
                entity.getValue(),
                entity.getSensorType()
        );
    }
}
