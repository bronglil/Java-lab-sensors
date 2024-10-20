package com.example.application.mapper;

import com.example.application.dto.Window;
import com.example.application.entity.RoomEntity;
import com.example.application.entity.WindowEntity;
import com.example.application.entity.WindowStatus;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WindowMapperTest {

    @Test
    void shouldMapWindowEntityToDto() {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(1L);

        WindowEntity windowEntity = new WindowEntity();
        windowEntity.setId(1L);
        windowEntity.setName("Window 1");
        windowEntity.setWindowStatus(WindowStatus.CLOSED);
        windowEntity.setRoom(roomEntity);

        Window windowDto = WindowMapper.of(windowEntity);

        assertEquals(1L, windowDto.id());
        assertEquals("Window 1", windowDto.name());
        assertEquals(WindowStatus.CLOSED, windowDto.windowStatus());
        assertEquals(1L, windowDto.roomId());
    }
}
