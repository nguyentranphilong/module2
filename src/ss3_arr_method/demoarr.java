package ss3_arr_method;

import java.util.Arrays;
import java.util.Scanner;

public class demoarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap hang");
        int cot = sc.nextInt();
        System.out.println("nhap cot");
        int hang = sc.nextInt();
        int[][] arr = new int[cot][hang];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
