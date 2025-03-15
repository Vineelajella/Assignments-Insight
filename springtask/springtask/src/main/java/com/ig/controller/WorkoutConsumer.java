package com.ig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import com.ig.entity.Workout;

@RestController
@RequestMapping("/workout-consumer")
public class WorkoutConsumer {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "http://localhost:5050/api/workout"; // Provider Service URL

    @GetMapping("/workouts")
    public ResponseEntity<List<Workout>> consumeWorkouts() {
        ResponseEntity<Workout[]> response = restTemplate.getForEntity(BASE_URL, Workout[].class);

        // Convert Array to List
        List<Workout> workoutList = Arrays.asList(response.getBody());

        return ResponseEntity.ok(workoutList);
    }
}
