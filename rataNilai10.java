import java.util.Scanner;

public class rataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, totalNilai, nilaiMhs;

        i = 1;
        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            double nilaiRata = totalNilai / 5;
            System.out.println("Nilai rata Mahasiswa adalah " + nilaiRata);
            i++;
        }
    }

}
