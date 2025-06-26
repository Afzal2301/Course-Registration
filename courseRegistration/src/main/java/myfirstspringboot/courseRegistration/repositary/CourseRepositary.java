package myfirstspringboot.courseRegistration.repositary;

import myfirstspringboot.courseRegistration.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositary extends JpaRepository <Courses,Integer>{

}
