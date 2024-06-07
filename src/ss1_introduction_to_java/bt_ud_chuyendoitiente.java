package ss1_introduction_to_java;

import java.util.Scanner;

public class bt_ud_chuyendoitiente {
    public static void main(String[] args) {
//        double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap usd: ");
        double usd = sc.nextDouble();
        double math = usd * 23000;
        System.out.println("vnd: " + math);
    }
}
