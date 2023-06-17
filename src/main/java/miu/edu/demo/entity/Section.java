package miu.edu.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Section {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer term;
    Integer academicYear;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Student> students;


}
