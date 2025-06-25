package com.example.CorseRegistrationSystem.Controller;


import com.example.CorseRegistrationSystem.Modules.Course;
import com.example.CorseRegistrationSystem.Modules.CourseRegistry;
import com.example.CorseRegistrationSystem.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5500")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @PostMapping("courses/add")
    public String addCourse(@RequestBody List<Course> course){
        courseService.addCourse(course);
        return "Courses added";
    }


}
