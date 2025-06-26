package myfirstspringboot.courseRegistration.repositary;

import myfirstspringboot.courseRegistration.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,String> {
}
