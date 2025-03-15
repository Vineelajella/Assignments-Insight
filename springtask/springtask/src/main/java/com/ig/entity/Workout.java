package com.ig.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "workouts")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 1, message = "Duration must be at least 1 minute")
    private int duration;

    @Min(value = 1, message = "Calories burnt should be at least 1")
    private int calBurnt;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Category is required")
    private Category category;  // ✅ Added category field

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public int getCalBurnt() { return calBurnt; }
    public void setCalBurnt(int calBurnt) { this.calBurnt = calBurnt; }
    public Category getCategory() { return category; }  // ✅ Getter
    public void setCategory(Category category) { this.category = category; }  // ✅ Setter
}

enum Category {
    MORNINGWALK, EVENINGRUN, BOXING, SWIMMING;
}



	


