import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        String[] array = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        int index = -1;
        for (int i=0; i<array.length;i++){
            if (array[i].equals(name)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.print("Vị trí " + index);
        } else {
            System.out.print("Không tìm thấy sinh viên đó");
        }
    }
}
