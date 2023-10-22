package repositories;



import models.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherDAO extends CrudRepository<Teacher, Long> {
    List<Teacher> findAll();
}
