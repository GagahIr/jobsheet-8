import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        String nama;

        System.out.println("---Cabor PORSENI 2024---");
        System.out.println("1. Badminton\n2. Tenis Meja\n3. Basket\n4. Voli");

        i = 1;
        while (i <= 5) {
            System.out.println("Cabang ke-" + i);
            j = 1;
            while (j <= 5) {
                System.out.print("Nama atlet ke-" + j + " : ");
                nama = sc.next();
                j++;
            }
            i++;
        }
    }
}