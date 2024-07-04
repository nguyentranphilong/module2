package cs_module2.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private int salary;

    public Teacher(int id, String code, String name, LocalDate birthday, String email, int salary) {
        super(id, code, name, birthday, email);
        this.salary = salary;
    }

    public Teacher(int id, String code, String name, LocalDate birthday, String email) {
        super(id, code, name, birthday, email);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", email='" + getEmail() + '\'' +
                ", salary=" + salary + '\'' +
                '}';
    }
}
