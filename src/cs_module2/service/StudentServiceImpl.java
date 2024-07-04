package cs_module2.service;

import cs_module2.model.Student;
import cs_module2.repository.IStudentRepository;
import cs_module2.repository.StudentRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository studentRepository = new StudentRepositoryImpl();

    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean addStudent(int id, String code, String name, LocalDate birthday, String email, String className) {
        return studentRepository.addStudent(id, code, name, birthday, email, className);
    }

    @Override
    public boolean removeStudent(int id) {
        return studentRepository.removeStudent(id);
    }

    public boolean updateStudent(int id, String name, LocalDate birthday, String email, String className) {
        return studentRepository.updateStudent(id, name, birthday, email, className);
    }

}
