package thipassmodule2.view;

import thipassmodule2.controller.BenhanNorController;

import java.util.Scanner;

public class BenhvienManagement {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuFunc();
    }

        public static void menuFunc() {
            do {
                System.out.println("""
                        ----------------Chương trình quản lý bệnh nhân ---------------
                        1. Quản lí bệnh nhân vip
                        2. Quản lí bệnh nhân thường
                        0. Thoát chương trình
                        Nhập lựa chọn:\s""");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 0:
                        System.exit(0);
                    case 1:
                        chooseBenhanVipFunction();
                    case 2:
                        chooseBenhanNorFunction();
                        break;
                    default:
                        System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
                }
            } while (true);
        }

    public static void chooseBenhanVipFunction() {
        BenhanNorController teacherController = new BenhanNorController();
        do{
            System.out.println("""
                    ---------Quản lí bệnh nhân vip----------
                    1. Hiển thị danh sách bệnh nhân
                    2. Thêm bệnh nhân
                    3. Xóa bệnh nhân
                    4. Chỉnh sửa thông tin bệnh nhân
                    5. Quay lại trang chủ
                    Nhập lựa chọn :""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 5, 1, 2, 3, 4: return;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }

    public static void chooseBenhanNorFunction() {
        BenhanNorController benhanNorController = new BenhanNorController();
        do{
            System.out.println("""
                    ---------Quản lí bệnh nhân thường----------
                    1. Hiển thị danh sách bệnh nhân
                    2. Thêm bệnh nhân
                    3. Xóa bệnh nhân
                    4. Chỉnh sửa thông tin bệnh nhân
                    5. Quay lại trang chủ
                    Nhập lựa chọn :""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 5 : return;
                case 1 : benhanNorController.displaybenhanNor(); break;
                case 2 : benhanNorController.addbennhanNor(); break;
                case 3 : benhanNorController.delete(); break;
                case 4 : benhanNorController.update(); break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }
}
