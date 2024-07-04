package cs_module2.repository;

import cs_module2.model.Student;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
    private final static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1, "HV-001", "Nam", LocalDate.parse("2001-12-10"), "namCGDN@gmail.com", "C0324M4"));
        students.add(new Student(2, "HV-002", "Lan", LocalDate.parse("2002-01-12"), "lanCGDN@gmail.com", "C0324M4"));
        students.add(new Student(3, "HV-003", "Phúc", LocalDate.parse("2005-10-14"), "phucCGDN@gmail.com", "C0324M4"));
        students.add(new Student(4, "HV-004", "Trang", LocalDate.parse("2003-07-22"), "trangCGDN@gmail.com", "C0324M4"));
        students.add(new Student(5, "HV-005", "Duy", LocalDate.parse("2004-09-30"), "duyCGDN@gmail.com", "C0324M4"));
    }

    @Override
    public ArrayList<Student> findAll() {
        return (ArrayList<Student>) students;
    }

    public boolean addStudent(int id, String code, String name, LocalDate birthday, String email, String className) {
        return students.add(new Student(id, code, name, birthday, email, className));
    }

    @Override
    public boolean removeStudent(int id) {
        return students.removeIf(student -> student.getId() == id);
    }

    @Override
    public boolean updateStudent(int id, String name, LocalDate birthday, String email, String className) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setBirthday(birthday);
                student.setEmail(email);
                student.setClassName(className);
                found = true;
                break;
            }
        }
        return found;
    }
}
