package cs_module2.service;

import cs_module2.model.Teacher;
import cs_module2.repository.ITeacherRepository;
import cs_module2.repository.TeacherRepositoryImpl;

public class TeacherServiceImpl implements ITeacherService{
    private final ITeacherRepository iTeacherRepository = new TeacherRepositoryImpl();
    @Override
    public Teacher[] findAll() {
        return iTeacherRepository.findAll();
    }
}
