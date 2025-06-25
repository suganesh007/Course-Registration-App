package com.example.CorseRegistrationSystem.Service;


import com.example.CorseRegistrationSystem.Modules.CourseRegistry;
import com.example.CorseRegistrationSystem.Repo.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistryService {

    @Autowired
    CourseRegistryRepo courseRegistryRepo;


    public List<CourseRegistry> getEnrolledStudents() {
        return courseRegistryRepo.findAll();
    }


    public void addNewStudent(String name, String emailId, String courseName) {
        CourseRegistry student = new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(student);
    }
}
