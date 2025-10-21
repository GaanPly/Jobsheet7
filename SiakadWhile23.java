import java.util.Scanner;

public class SiakadWhile23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai,jml,i=0;
        System.out.print("Masukkan jumlah Mahasigma = ");
        jml = input.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai Mahasiswa = ");
            nilai = input.nextInt();

            if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai Invalid");
            continue;
            }

            if (nilai > 80){
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "Adalah A");
            }
            else if (nilai > 73){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah B+");
            }
            else if (nilai > 65){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah B");
            }
            else if (nilai > 60){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah C+");
            }
            else if (nilai > 50){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah C");
            }
            else if (nilai > 39){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah D");
            }
            else {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah E");
            }
        i++;
        }
    }
}
