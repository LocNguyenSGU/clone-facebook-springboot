package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.Mode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeRepository extends JpaRepository<Mode, Integer> {
    List<Mode> findAll();
}
