package cs_module2.service;

import cs_module2.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> findAll();

    boolean addStudent(int id, String code, String name, LocalDate birthday, String email, String className);

    boolean removeStudent(int id);

    boolean updateStudent(int id, String name, LocalDate birthday, String email, String className);
}