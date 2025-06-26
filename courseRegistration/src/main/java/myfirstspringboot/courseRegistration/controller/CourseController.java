package myfirstspringboot.courseRegistration.controller;

import myfirstspringboot.courseRegistration.model.CourseRegistry;
import myfirstspringboot.courseRegistration.model.Courses;
import myfirstspringboot.courseRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    List<Courses> showallcourses(){
        return courseService.showallcourses();
    }
    @GetMapping("/courses/enrolled")
    List<CourseRegistry> showallstudents(){
        return courseService.showallstudents();
    }
    @PostMapping("courses")
    public String studentdata(@RequestParam String name,@RequestParam String email_id,@RequestParam String course){
        courseService.enrollastudent(name,email_id,course);
        return "congragulations !!" +name+ " you successfully enrolled the " +course+ " course";
    }
}
