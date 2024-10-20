package com.example.application;

import com.example.application.entity.RoomEntity;
import com.example.application.entity.SensorEntity;
import com.example.application.entity.SensorType;
import com.example.application.entity.WindowEntity;

import java.util.Set;

public class FakeEntityBuilder {

    public static RoomEntity createRoomEntity(Long id, String name) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(id);
        roomEntity.setName(name);

        roomEntity.setWindows(Set.of(
                createWindowEntity(id * 10 + 1L, "Window1" + name, roomEntity),
                createWindowEntity(id * 10 + 2L, "Window2" + name, roomEntity)
        ));

        return roomEntity;
    }

    public static WindowEntity createWindowEntity(Long id, String name, RoomEntity roomEntity) {
        WindowEntity windowEntity = new WindowEntity();
        windowEntity.setId(id);
        windowEntity.setName(name);
        windowEntity.setRoom(roomEntity);
        return windowEntity;
    }

    public static SensorEntity createSensorEntity(Long id, String name, SensorType type, Double value) {
        SensorEntity sensorEntity = new SensorEntity();
        sensorEntity.setId(id);
        sensorEntity.setName(name);
        sensorEntity.setSensorType(type);
        sensorEntity.setValue(value);
        return sensorEntity;
    }
}
