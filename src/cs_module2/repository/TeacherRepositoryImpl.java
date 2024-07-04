package cs_module2.repository;

import cs_module2.model.Student;
import cs_module2.model.Teacher;

import java.time.LocalDate;

public class TeacherRepositoryImpl implements ITeacherRepository{
    private static final Teacher[] teachers;
    static {
        teachers = new Teacher[5];
        teachers[0] = new Teacher(1, "GV-001", "Cong", LocalDate.parse("1991-08-11"),
                "Congnguyen@gmail.com", 1000);
        teachers[1] = new Teacher(2, "GV-002", "Nguyen", LocalDate.parse("1991-08-11"),
                "Nguyennguyen@gmail.com", 2000);
        teachers[2] = new Teacher(3, "GV-003", "Pham", LocalDate.parse("1991-08-11"),
                "Phamnguyen@gmail.com", 3000);
    }
    @Override
    public Teacher[] findAll() {
        return teachers;
    }
}
