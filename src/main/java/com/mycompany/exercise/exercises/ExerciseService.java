package com.mycompany.exercise.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    private List<Exercises> exercises = new ArrayList<>(Arrays.asList(
        new Exercises("1", "test1"),
        new Exercises("2", "test2"),
        new Exercises("3", "test3"),
        new Exercises("4", "test4")
    ));
    
    public List<Exercises> getAllExercises() {
        return exercises;
    }
    
    public Exercises getExercise(String id) {
        return exercises.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addExercise(Exercises exercise) {
        exercises.add(exercise);
    }
}
