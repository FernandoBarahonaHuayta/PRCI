package services;

import models.Student;
import models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.StudentDAO;
import repositories.TeacherDAO;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDAO studentRepository;

    @Override
    public List<Teacher> getAllStudents() {
        // TODO Auto-genereted method
        return this.studentRepository.findAll();
    }
}
