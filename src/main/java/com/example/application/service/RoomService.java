package com.example.application.service;

import com.example.application.entity.RoomEntity;
import com.example.application.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<RoomEntity> findAll() {
        return roomRepository.findAll();
    }

    public Optional<RoomEntity> findById(Long id) {
        return roomRepository.findById(id);
    }

    public RoomEntity create(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }

    public RoomEntity update(Long id, RoomEntity updatedRoomEntity) {
        Optional<RoomEntity> existingRoom = roomRepository.findById(id);
        if (existingRoom.isPresent()) {
            RoomEntity roomEntity = existingRoom.get();
            roomEntity.setName(updatedRoomEntity.getName());
            // Update other properties as needed
            return roomRepository.save(roomEntity);
        } else {
            return null;  // Or throw a RoomNotFoundException
        }
    }

    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
