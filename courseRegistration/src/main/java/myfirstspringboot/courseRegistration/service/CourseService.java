package myfirstspringboot.courseRegistration.service;
import myfirstspringboot.courseRegistration.model.CourseRegistry;
import myfirstspringboot.courseRegistration.model.Courses;
import myfirstspringboot.courseRegistration.repositary.CourseRegistryRepo;
import myfirstspringboot.courseRegistration.repositary.CourseRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepositary courseRepositary;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Courses> showallcourses() {
      return courseRepositary.findAll();
    }

    public void enrollastudent(String name, String emailId, String course) {
        CourseRegistry courseRegistry = new CourseRegistry();
        courseRegistry.setName(name);
        courseRegistry.setEmail_id(emailId);
        courseRegistry.setCourse(course);
        courseRegistryRepo.save(courseRegistry);
    }

    public List<CourseRegistry> showallstudents(){
       return courseRegistryRepo.findAll();
    }
}
