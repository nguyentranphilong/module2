package thipassmodule2.controller;

import thipassmodule2.commom.Validation;
import thipassmodule2.model.BenhanNor;
import thipassmodule2.service.IBenhanService;
import thipassmodule2.service.BenhanService;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BenhanNorController {
    private static final IBenhanService iTeacherService = new BenhanService();
    private final Scanner scanner = new Scanner(System.in);

    public static int generateId() {
        List<BenhanNor> teachers = iTeacherService.findAll();
        return !teachers.isEmpty() ? teachers.getLast().getId() + 1 : 1;
    }

    public void addbennhanNor() {
        BenhanNor teacher = getTeacher(generateId());
        iTeacherService.add(teacher);
    }

    public void displaybenhanNor() {
        List<BenhanNor> teachers = iTeacherService.findAll();
        for (BenhanNor t : teachers) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public boolean isExist(int id){
        BenhanNor teacher = iTeacherService.findById(id);
        return teacher!=null;
    }

    public void update() {
        System.out.println("Nhập ID BN cần cập nhật:");
        int id = Integer.parseInt(scanner.nextLine());
        if(isExist(id)){
            BenhanNor teacher = getTeacher(id);
            iTeacherService.update(teacher);
        }else{
            System.out.println("Không tìm thấy BN với ID này.");
        }
    }

    public void delete(){
        System.out.println("Nhập ID BN cần xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        if(isExist(id)){
            iTeacherService.delete(id);
        }else{
            System.out.println("Không tìm thấy BN với ID này.");
        }
    }

    private BenhanNor getTeacher(int id) {
        System.out.println("Nhập mã BN:");
        String code = scanner.nextLine();
        System.out.println("Nhập tên BN:");
        String name = scanner.nextLine();
        String temp;
        do {
            System.out.println("Nhập ngày vao (yyyy-MM-dd):");
            temp = scanner.nextLine();
        } while (Validation.isValidBirthday(temp));
        LocalDate dayin = LocalDate.parse(temp);
        String temp2;
        do {
            System.out.println("Nhập ngày ra (yyyy-MM-dd):");
            temp2 = scanner.nextLine();
        } while (Validation.isValidBirthday(temp2));
        LocalDate dayout = LocalDate.parse(temp2);
        System.out.println("Nhập ly do:");
        String lydo = scanner.nextLine();
        int phinamvien = scanner.nextInt();
        return new BenhanNor(generateId(), code, name, dayin, dayout, lydo, phinamvien);
    }
}
