package cs_module2.model;

import java.time.LocalDate;

public class Student extends Person {
    private String className;

    public Student(int id, String code, String name, LocalDate birthday, String email, String className) {
        super(id, code, name, birthday, email);
        this.className = className;
    }
    public Student(int id, String code, String name, LocalDate birthday, String email) {
        super(id, code, name, birthday, email);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", email='" + getEmail() + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
