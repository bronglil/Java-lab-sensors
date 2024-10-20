package com.example.application.mapper;

import com.example.application.dto.SensorDto;
import com.example.application.entity.SensorEntity;
import com.example.application.entity.SensorType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SensorMapperTest {

    @Test
    void shouldMapSensorEntityToDto() {
        SensorEntity sensorEntity = new SensorEntity();
        sensorEntity.setId(1L);
        sensorEntity.setName("Temperature Sensor");
        sensorEntity.setSensorType(SensorType.TEMPERATURE);
        sensorEntity.setValue(25.0);

        SensorDto sensorDto = SensorMapper.of(sensorEntity);

        assertEquals(1L, sensorDto.id());
        assertEquals("Temperature Sensor", sensorDto.name());
        assertEquals(SensorType.TEMPERATURE, sensorDto.sensorType());
        assertEquals(25.0, sensorDto.value());
    }
}
