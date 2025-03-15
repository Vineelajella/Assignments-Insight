package com.ig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ig.entity.Workout;
import com.ig.exception.WorkoutNotFoundException;
import com.ig.repository.WorkoutRepo;

@Service  
@Transactional
public class WorkoutServiceImpl implements Workoutservice { 

   
@Autowired
WorkoutRepo workoutRepo;

   

    @Override
    public Integer addWorkout(Workout workout) {
        return workoutRepo.save(workout).getId();
    }

    @Override
    public List<Workout> getAllWorkouts() {
        List<Workout> workouts = workoutRepo.findAll();
        if (workouts.isEmpty()) {
            throw new WorkoutNotFoundException("No workouts found");
        }
        return workouts;
    }

    @Override
    public Workout getWorkout(Integer id) {
        return workoutRepo.findById(id)
                .orElseThrow(() -> new WorkoutNotFoundException("Workout with ID " + id + " not found"));
    }
}
