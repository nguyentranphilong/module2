package ss1_introduction_to_java;

import java.util.Scanner;

public class bt_hien_loi_chao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten cua ban vao day: ");
        String name = sc.nextLine();
        System.out.println("chao " + name);
    }
}
