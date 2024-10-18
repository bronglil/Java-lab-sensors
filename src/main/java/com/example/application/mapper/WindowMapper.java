package com.example.application.mapper;

import com.example.application.dto.Window;
import com.example.application.entity.WindowEntity;

public class WindowMapper {
    public static Window of(WindowEntity entity) {
        return new Window(
                entity.getId(),
                entity.getName(),
                entity.getWindowStatus(),
                entity.getRoom().getId()
        );
    }
}