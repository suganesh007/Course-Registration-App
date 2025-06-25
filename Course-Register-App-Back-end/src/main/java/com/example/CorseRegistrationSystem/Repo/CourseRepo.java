package com.example.CorseRegistrationSystem.Repo;


import com.example.CorseRegistrationSystem.Modules.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
