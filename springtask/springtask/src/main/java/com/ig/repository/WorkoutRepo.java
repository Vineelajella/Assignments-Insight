package com.ig.repository;  // Ensure package matches your project structure

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ig.entity.Workout;

@Repository  
public interface WorkoutRepo extends JpaRepository<Workout, Integer> {
}
