package com.example.CorseRegistrationSystem.Controller;

import com.example.CorseRegistrationSystem.Modules.CourseRegistry;
import com.example.CorseRegistrationSystem.Service.CourseRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
public class CourseRegistryController {

    @Autowired
    CourseRegistryService courseRegistryService;

    @GetMapping("courses/students/enrolled")
    public List<CourseRegistry> getEnrolledStudents(){
        return courseRegistryService.getEnrolledStudents();
    }

    @PostMapping("courses/students/enrol")
    public String addNewStudent(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
        courseRegistryService.addNewStudent(name, emailId, courseName);
        return "Student Added...";
    }

}
