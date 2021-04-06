import java.util.Scanner;

public class findMax {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Không được vượt quá 20 người");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Danh sách:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Vị trí: " + index);
    }
}
