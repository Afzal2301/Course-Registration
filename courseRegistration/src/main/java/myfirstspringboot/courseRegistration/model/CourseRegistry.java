package myfirstspringboot.courseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class CourseRegistry {
    @Id
    private String email_id;
    private String name ;
    private String course;

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
