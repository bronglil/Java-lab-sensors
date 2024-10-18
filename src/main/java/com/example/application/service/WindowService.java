package com.example.application.service;

import com.example.application.entity.WindowEntity;
import com.example.application.repository.WindowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WindowService {

    private final WindowRepository windowRepository;

    public WindowService(WindowRepository windowRepository) {
        this.windowRepository = windowRepository;
    }

    // Get all windows
    public List<WindowEntity> findAll() {
        return windowRepository.findAll();
    }

    // Get a window by ID
    public Optional<WindowEntity> findById(Long id) {
        return windowRepository.findById(id);
    }

    // Create a new window
    public WindowEntity create(WindowEntity windowEntity) {
        return windowRepository.save(windowEntity);
    }

    // Update an existing window by ID
    public WindowEntity update(Long id, WindowEntity updatedWindowEntity) {
        Optional<WindowEntity> existingWindowOpt = windowRepository.findById(id);

        if (existingWindowOpt.isPresent()) {
            WindowEntity existingWindow = existingWindowOpt.get();
            existingWindow.setName(updatedWindowEntity.getName());
            // Add more fields to update as necessary
            return windowRepository.save(existingWindow); // Save the updated window entity
        } else {
            return null; // Handle case where window is not found, e.g., throw an exception
        }
    }

    // Delete a window by ID
    public void deleteWindow(Long id) {
        windowRepository.deleteById(id);
    }
}
