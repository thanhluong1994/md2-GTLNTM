import java.util.Scanner;

public class giatrilonnhattrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" Nhap size ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size khong qua 20");
        }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print(" Nhap phan tu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sach phan tu: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println(" Gia tri lon nhat trong mang la : " + max + " Vi tri thu : " + index);
    }
}