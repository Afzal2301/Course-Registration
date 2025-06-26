package myfirstspringboot.courseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Courses {
    @Id
    private Integer id;
    private String course;
    private String trainer;
    private int duration_in_weeks;
}
