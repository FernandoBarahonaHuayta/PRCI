package repositories;

import models.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDAO extends CrudRepository<Student, Long> {
    List<Student> findAll();
}
