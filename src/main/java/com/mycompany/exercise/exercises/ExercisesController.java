package com.mycompany.exercise.exercises;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercisesController {
    
    @Autowired
    private ExerciseService exerciseService;
    
    @RequestMapping("/exercises")
    public List<Exercises> getAllExercises() {
        return exerciseService.getAllExercises();
    }
    
    @RequestMapping("/exercises/{id}")
    public Exercises getExercise(@PathVariable String id) {
        return exerciseService.getExercise(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/exercises")
    public void addExercise(@RequestBody Exercises exercise) {
        exerciseService.addExercise(exercise);
    }
}
