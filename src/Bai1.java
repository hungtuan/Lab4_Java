public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {10, 25, -4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42, -6};
//      getArr(arr);

//      int count =  getArr1(arr);
//      System.out.println("Số lượng phần tử chia hết cho 2 và 6 là: "+count);

//      int sum = getSum(arr);
//      System.out.println("Tổng các giá trị có chỉ số chẵn "+sum);

//      isSearch(arr);
//      System.out.println("Mảng sau khi thay thế các phần tử âm bằng 0:");
//      for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//      }

    }

    //1: Liệt kê vị trí và giá trị các phần tử là số lẻ
/*  public static void getArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Phần tử số lẻ tại vị trí "+i+" có giá trị là "+ arr[i]);
            }
        }
    }*/

    //2: Đếm các phần tử có giá trị chia hết cho 2 và cũng chia hết cho 6
/*  public static int getArr1(int[] arr) {
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && (arr[i] % 6 == 0)) {
                dem++;
            }
        }
        return dem;
    }*/

    //3: Tính tổng giá trị các phần tử có chỉ số chẵn
   /* public static int getSum(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i += 2){
                tong+=arr[i];
        }
        return tong;
    }*/

    //4:Tìm kiếm và thay thế các phần tử có giá trị âm bằng giá trị 0
    public static void isSearch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
}