package com.example.application.controller;

import com.example.application.dto.Window;
import com.example.application.entity.WindowEntity;
import com.example.application.mapper.WindowMapper;
import com.example.application.service.WindowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/windows")
public class WindowController {

    private final WindowService windowService;

    public WindowController(WindowService windowService) {
        this.windowService = windowService;
    }

    @GetMapping
    public List<Window> findAll() {
        return windowService.findAll().stream()
                .map(WindowMapper::of)
                .toList();
    }

    @GetMapping("/{id}")
    public Window findById(@PathVariable Long id) {
        return windowService.findById(id).map(WindowMapper::of).orElse(null);
    }

    @PostMapping
    public Window create(@RequestBody WindowEntity windowEntity) {
        return WindowMapper.of(windowService.create(windowEntity));
    }

    @PutMapping("/{id}")
    public Window update(@PathVariable Long id, @RequestBody WindowEntity windowEntity) {
        return WindowMapper.of(windowService.update(id, windowEntity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        windowService.deleteWindow(id);
    }
}
