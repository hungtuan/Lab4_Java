import java.util.Arrays;
import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21);
        }
        System.out.println(Arrays.toString(arr));
        int count = countX(arr);
        System.out.println("X xuất hiện: " + count + " lần");
        duplicateValue(arr);


    }

    //1: Kiểm tra X xuất hiện bao nhiêu lần trong mảng
    public static int countX(int[] arr) {
        int x = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    //2:In ra phần tử có giá trị bị trùng lặp trong mảng trên 3 lần
    public static void duplicateValue(int[] arr) {
                boolean[] printed = new boolean[21]; // mảng boolean để đánh dấu các phần tử đã được in ra
                for (int i = 0; i < arr.length; i++) {
                    int count = 0; // biến đếm số lần xuất hiện của phần tử
                    for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > 3 && !printed[arr[i]]) { // nếu phần tử có giá trị bị trùng lặp trên 3 lần và chưa được in ra trước đó
                System.out.println("Phần tử " + arr[i] + " xuất hiện " + count + " lần trong mảng.");
                printed[arr[i]] = true; // đánh dấu phần tử đã được in ra
            }
        }
    }
}
