package com.in28minutes.springboot.learn_spring_boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1L, "Learn Spring Framework", "in28minutes"),
                new Course( 2L, "Learn Spring Boot", "in28minutes"),
                new Course(3L, "Learn API", "in28minutes"),
                new Course(4L, "Learn Microservices", "in28minutes"),
                new Course(5L, "Learn AWS", "in28minutes"),
                new Course(6L, "Learn Azure", "in28minutes"),
                new Course(7L, "Learn Docker", "in28minutes")
        );
    }
}
