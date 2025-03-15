package com.ig.service;

import java.util.List;
import com.ig.entity.Workout;
import com.ig.exception.WorkoutNotFoundException;

public interface Workoutservice {
    Integer addWorkout(Workout workout) throws WorkoutNotFoundException;
    List<Workout> getAllWorkouts() throws WorkoutNotFoundException;
    Workout getWorkout(Integer id) throws WorkoutNotFoundException;  // ✅ Added method
}
