import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;
        while (N < 3) {
            System.out.print("Masukkan N : ");
            N = sc.nextInt();
            if (N <= 2) {
                System.out.println("Input minimal 3");
            }
        }
        System.out.println();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(" " + N + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}