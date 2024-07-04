package ss13_thuattoantinkiem;

import java.util.Scanner;

public class BinarySearch {
    @org.jetbrains.annotations.Contract(pure = true)
    public static int binarySearch (int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập kích thước mảng:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhập các phần tử của mảng theo thứ tự tăng dần:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("nhập giá trị cần tìm");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("không tìm thấy giá trị trong mảng");
        } else {
            System.out.println("vị trí của giá trị trong mảng là: " + result);
        }
    }
}
