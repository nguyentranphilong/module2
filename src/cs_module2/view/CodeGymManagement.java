package cs_module2.view;

import cs_module2.controller.StudentController;
import cs_module2.controller.TeacherController;

import java.util.Scanner;

//public class CodeGymManagement {
//   private static final Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        chooseMainFunction();
//
//    }
//    public static void chooseMainFunction(){
//        do {
//            System.out.println("chon chuc nang: \n"
//                     + "1. QL sinh vien \n"
//                     + "2. Ql giang vien \n"
//                     + "3. Ket thuc chuong trinh");
//           int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                    case 1:
//                        chooseStudentFunction();
//                        break;
//                    case 2:
//                        chooseTeacherFunction();
//                        break;
//                    case 3:
//                        System.exit(0);
//                    default:
//                        System.out.println("nhap lai chuc nang");
//                }
//        }while (true);
//    }
//
//    public static void chooseStudentFunction(){
//        StudentController studentController = new StudentController();
//        do {
//            System.out.println("chon chuc nang: \n"
//                    + "1. Hien thi danh sach \n"
//                    + "2. them moi sinh vien \n"
//                    + "3. Chinh sua sinh vien \n"
//                    + "4. Xoa sinh vien \n"
//                    + "5. Quay ve menu chinh");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    studentController.displayStudent();
//                    break;
//                case 2:
//                    System.out.println("Goi den chuc nang them moi sinh vien");
//                    break;
//                case 3:
//                    System.out.println("Goi den chuc nang chinh sua sinh vien");
//                    break;
//                case 4:
//                    System.out.println("goi den chuc nang xoa sinh vien");
//                    break;
//                case 5:
//                    return;
//            }
//    }while (true);
//    }
//    public static void chooseTeacherFunction() {
//        TeacherController teacherController = new TeacherController();
//        do {
//            System.out.println("chon chuc nang: \n"
//                    + "1. Hien thi danh sach \n"
//                    + "2. them moi giang vien \n"
//                    + "3. Chinh sua giang vien \n"
//                    + "4. Xoa giang vien \n"
//                    + "5. Quay ve menu chinh");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    teacherController.displayTeacher();
//                    break;
//                case 2:
//                    System.out.println("Goi den chuc nang them moi giang vien");
//                    break;
//                case 3:
//                    System.out.println("Goi den chuc nang chinh sua giang vien");
//                    break;
//                case 4:
//                    System.out.println("goi den chuc nang xoa giang vien");
//                    break;
//                case 5:
//                    return;
//            }
//        }while (true);
//    }
//}
//view -> controller -> service -> repo

public class CodeGymManagement {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        chooseMainFunction();
    }

    public static void chooseMainFunction() {
        do {
            System.out.println("""
                    ----------------Trang chủ---------------
                    1. Quản lí học viên
                    2. Quản lí giảng viên
                    3. Thoát chương trình
                    Nhập lựa chọn:""");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 3:
                    System.exit(0);
                case 1:
                    chooseStudentFunction();
                    break;
                case 2:
                    chooseTeacherFunction();
                    break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }

    public static void chooseStudentFunction() {
        StudentController studentController = new StudentController();
        do{
            System.out.println("""
                    ---------Quản lí học viên----------
                    1. Hiển thị danh sách HV
                    2. Thêm học viên
                    3. Xóa học viên
                    4. Chỉnh sửa thông tin HV
                    5. Quay lại trang chủ
                    Nhập lựa chọn :""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 5 : return;
                case 1 : studentController.displayAllStudents(); break;
                case 2 :
                    studentController.addStudent();
                    break;
                case 3 :
                    studentController.removeStudent();
                    break;
                case 4 :
                    studentController.updateStudent();
                    break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);

    }

    public static void chooseTeacherFunction() {
        TeacherController teacherController = new TeacherController();
        do{
            System.out.println("""
                    ---------Quản lí giảng viên----------
                    1. Hiển thị danh sách GV
                    2. Thêm giảng viên
                    3. Xóa giảng viên
                    4. Chỉnh sửa thông tin GV
                    5. Quay lại trang chủ
                    Nhập lựa chọn :""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 5 : return;
                case 1 : teacherController.displayTeacher(); break;
                case 2 :
                case 3 :
                case 4 :
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }
}
