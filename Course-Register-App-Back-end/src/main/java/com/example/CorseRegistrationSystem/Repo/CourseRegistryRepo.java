package com.example.CorseRegistrationSystem.Repo;


import com.example.CorseRegistrationSystem.Modules.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {

}
