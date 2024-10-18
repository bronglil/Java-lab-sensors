package com.example.application.repository;

import com.example.application.entity.WindowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindowRepository extends JpaRepository<WindowEntity, Long> {
}