package thipassmodule2.repository;

import thipassmodule2.commom.IOStream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//(int id, String code, String name, LocalDate dayin, LocalDate dayout, String lydo, int phinamvien)
public class BenhanNorRepo implements IBenhanNorRepo {
    private static final List<thipassmodule2.model.BenhanNor> teachers;
    static {
        teachers = new ArrayList<>();
        thipassmodule2.model.BenhanNor s1 = new thipassmodule2.model.BenhanNor(1, "BN-101", "nguen van a", LocalDate.parse("2023-12-12"),
                LocalDate.parse("2024-01-01"), "ben tim", 10000000);

        teachers.add(s1);

    }
    @Override
    public List<thipassmodule2.model.BenhanNor> findAll() {
        return IOStream.convertToListTeacher();
    }

    @Override
    public void add(thipassmodule2.model.BenhanNor teacher) {
        IOStream.saveTeacherToFile(teacher);
    }

    @Override
    public void update(thipassmodule2.model.BenhanNor teacher) {
        List<thipassmodule2.model.BenhanNor> list = IOStream.convertToListTeacher();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == teacher.getId()) {
                list.set(i, teacher);
                break;
            }
        }
        IOStream.saveListTeacherToFile(list);
    }

    @Override
    public void delete(int id) {
        List<thipassmodule2.model.BenhanNor> list = IOStream.convertToListTeacher();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
        IOStream.saveListTeacherToFile(list);

    }

    @Override
    public thipassmodule2.model.BenhanNor findById(int id) {
        List<thipassmodule2.model.BenhanNor> list = IOStream.convertToListTeacher();
        for (thipassmodule2.model.BenhanNor s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
