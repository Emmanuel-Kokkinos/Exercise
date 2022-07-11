package com.mycompany.exercise.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    
    @Autowired
    private ExerciseRepository exerciseRepository;
    
    public List<Exercises> getAllExercises() {
        List<Exercises> exercises = new ArrayList<>();
        exerciseRepository.findAll().forEach(exercises::add);
        return exercises;
    }
    
    public Optional<Exercises> getExercise(String id) {
        return exerciseRepository.findById(id);
    }

    public void addExercise(Exercises exercise) {
        exerciseRepository.save(exercise);
    }

    void updateExercise(Exercises exercise) {
        exerciseRepository.save(exercise);
    }

    public void deleteExercise(String id) {
        exerciseRepository.deleteById(id);
    }
}
