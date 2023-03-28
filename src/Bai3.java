import java.util.Arrays;
import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // khởi tạo mảng với các giá trị ngẫu nhiên từ 0 đến 99
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        // tìm phần tử nhỏ nhất trong mảng
        int min = findMin(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
        //tìm phần tử lắn nhất
        int max = findMax(arr);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        //tìm giá trị trung bình các phần tử
        double avg = findAvg(arr);
        System.out.println("Giá trị trung bình của mảng là: " + avg);
        //số nguyên tố
        printPrimes(arr);

    }

    //1: Tìm phần tử nhỏ nhất trong mảng
    public static int findMin(int[] arr) {
        int min = arr[0]; // giả sử phần tử đầu tiên là nhỏ nhất
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // cập nhật giá trị nhỏ nhất
            }
        }
        return min;
    }

    //2: Tìm phần tử lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0]; // giả sử phần tử đầu tiên là nhỏ nhất
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // cập nhật giá trị nhỏ nhất
            }
        }
        return max;
    }

    //3:Tính giá trị trung bình các phần tử trong mảng
    public static double findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    //4: Hiển thị các phần tử là số nguyên tố trong mảng. Biết rằng số nguyên tố là số chỉ chia hết cho 1 và chính nó
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int[] arr) {
        System.out.print("Các phần tử số nguyên tố trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
