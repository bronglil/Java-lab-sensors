package com.example.application.controller;

import com.example.application.dto.Room;
import com.example.application.entity.RoomEntity;
import com.example.application.mapper.RoomMapper;
import com.example.application.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll().stream()
                .map(RoomMapper::of)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> findById(@PathVariable Long id) {
        return roomService.findById(id)
                .map(room -> new ResponseEntity<>(RoomMapper.of(room), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Room create(@RequestBody RoomEntity roomEntity) {
        return RoomMapper.of(roomService.create(roomEntity));
    }

    @PutMapping("/{id}")
    public Room update(@PathVariable Long id, @RequestBody RoomEntity roomEntity) {
        return RoomMapper.of(roomService.update(id, roomEntity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roomService.delete(id);
    }
}
