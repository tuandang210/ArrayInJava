import java.util.Scanner;

public class daoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số phần tử: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số phần tử tối đa là 20");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử: " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
