package com.ig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ig.entity.Workout;

import com.ig.service.Workoutservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api") 
public class WorkoutController {
	@Autowired
    Workoutservice service;

    

    @PostMapping("/workout")
    public ResponseEntity<String> addWorkout(@Valid @RequestBody Workout workout) {
        Integer workoutId = service.addWorkout(workout);
        return new ResponseEntity<>("Workout added successfully with ID: " + workoutId, HttpStatus.CREATED);
    }

    @GetMapping("workout/{id}")
    public ResponseEntity<Workout> getWorkout(@PathVariable Integer id) {
        Workout workout = service.getWorkout(id);
        return new ResponseEntity<>(workout, HttpStatus.OK);
    }

    @GetMapping("/workout")
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        List<Workout> workouts = service.getAllWorkouts();
        return new ResponseEntity<>(workouts, HttpStatus.OK);
    }
}



