package com.example.application.mapper;

import com.example.application.dto.Room;
import com.example.application.entity.RoomEntity;
import com.example.application.entity.WindowEntity;
import org.junit.jupiter.api.Test;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class RoomMapperTest {

    @Test
    void shouldMapRoomEntityToDto() {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(1L);
        roomEntity.setName("Room 1");

        WindowEntity windowEntity1 = new WindowEntity();
        windowEntity1.setId(1L);
        windowEntity1.setName("Window 1");

        WindowEntity windowEntity2 = new WindowEntity();
        windowEntity2.setId(2L);
        windowEntity2.setName("Window 2");

        roomEntity.setWindows(Set.of(windowEntity1, windowEntity2));

        Room roomDto = RoomMapper.of(roomEntity);

        assertEquals(1L, roomDto.id());
        assertEquals("Room 1", roomDto.name());
        assertEquals(2, roomDto.windows().size());
    }
}
