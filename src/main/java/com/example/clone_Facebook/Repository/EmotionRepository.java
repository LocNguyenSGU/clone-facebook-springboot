package com.example.clone_Facebook.Repository;

import com.example.clone_Facebook.Entity.Emotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmotionRepository extends JpaRepository<Emotion, Integer> {
    public List<Emotion> findAll();
}
