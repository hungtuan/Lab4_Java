import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số dòng và số cột từ người dùng
        System.out.println("Nhập vào sô dòng:");
        int n = sc.nextInt();
        System.out.println("Nhập vào số cột:");
        int m = sc.nextInt();
        //Khai báo mảng 2 chiều và nhập giá trị từ người dùng
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();

            }
        }

        // Hiển thị mảng
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Tính tổng các phần tử của mảng
        int sum = getSum(arr);
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }

    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
