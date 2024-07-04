package cs_module2.controller;

import cs_module2.model.Teacher;
import cs_module2.service.ITeacherService;
import cs_module2.service.TeacherServiceImpl;

public class TeacherController {
    private final ITeacherService iTeacherService = new TeacherServiceImpl();
    public void displayTeacher(){
        Teacher[] teachers = iTeacherService.findAll();
        for (Teacher t : teachers) {
            if (t == null) {
                break;
            }
            System.out.println(t);
        }
    }
}
