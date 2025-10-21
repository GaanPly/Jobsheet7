import java.util.Scanner;

public class parkirLoop23sesuaijobsheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0, jumlahKendaraan, i = 0;

        System.out.println("Masukkan Jenis Kendaraan !!");
        System.out.println("1. Mobil \n 2.Motor \n 0. Keluar");
        System.out.print("Input jenis kendaraan (angka) = ");
        jenis = input.nextInt();

        if (jenis > 2) {
            System.out.println("Invalid");
        }

        while (jenis != 0 && jenis <= 2) { 
            if (jenis == 1 || jenis ==2) {
                System.out.print("masukkan durasi parkir (masukkan 0 untuk berhenti parkir): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                }
                else if (durasi < 0) {
                    System.out.println("Input Invalid");
                }
                else if (durasi == 0) {
                    break;
                }
                else if (jenis == 1) {
                    total += durasi * 3000;
                }
                else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
        }
        System.out.println("Total Pendapatan : Rp " + total);
    }
}
