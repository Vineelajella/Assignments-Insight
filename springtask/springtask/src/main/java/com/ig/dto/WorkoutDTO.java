package com.ig.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class WorkoutDTO {
    private Integer id;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 1, message = "Duration must be at least 1 minute")
    private int duration;

    @Min(value = 1, message = "Calories burnt should be at least 1")
    private int calBurnt;

    @NotBlank(message = "Category is required")
    private String category;  // ✅ Added category field

    public WorkoutDTO() {}

    public WorkoutDTO(Integer id, String title, int duration, int calBurnt, String category) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.calBurnt = calBurnt;
        this.category = category;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public int getCalBurnt() { return calBurnt; }
    public void setCalBurnt(int calBurnt) { this.calBurnt = calBurnt; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
