package com.example.CorseRegistrationSystem.Service;


import com.example.CorseRegistrationSystem.Modules.Course;
import com.example.CorseRegistrationSystem.Modules.CourseRegistry;
import com.example.CorseRegistrationSystem.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public void addCourse(List<Course> course) {
        courseRepo.saveAll(course);
    }


}
