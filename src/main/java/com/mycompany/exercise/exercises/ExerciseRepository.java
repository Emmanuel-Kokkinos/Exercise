package com.mycompany.exercise.exercises;

import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercises, String> {
    
}
