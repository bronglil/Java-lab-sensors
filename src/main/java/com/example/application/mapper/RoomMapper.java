package com.example.application.mapper;

import com.example.application.dto.Room;
import com.example.application.entity.RoomEntity;

import java.util.stream.Collectors;

public class RoomMapper {
    public static Room of(RoomEntity entity) {
        return new Room(
                entity.getId(),
                entity.getName(),
                entity.getWindows().stream().map(WindowMapper::of).collect(Collectors.toList())
        );
    }
}
