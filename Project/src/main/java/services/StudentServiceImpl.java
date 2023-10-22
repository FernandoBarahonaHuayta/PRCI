package services;

import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.StudentDAO;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentRepository;

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-genereted method
        return this.studentRepository.findAll();
    }
}
