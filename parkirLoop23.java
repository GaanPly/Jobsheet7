import java.util.Scanner;

public class parkirLoop23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0, jumlahKendaraan, i = 0;

        System.out.print("inisialisasi aplikasi 1(Ya) / 0(Tidak) : ");
        i = input.nextInt();

        if (i == 1) {
            System.out.print("Masukkan Jumlah Kendaraan yang masuk : ");
            jumlahKendaraan = input.nextInt();
            while (i <= jumlahKendaraan ) {
                System.out.println("masukkan Jenis Kendaraan");
                System.out.println("1. Motor");
                System.out.println("2. Mobil");
                System.out.print("Input = ");
                jenis = input.nextInt();

                System.out.print("input durasi : ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                }
                else if (jenis == 1) {
                    total += durasi * 2000;
                }
                else if (jenis == 2) {
                    total += durasi * 3000;
                }
                else if (durasi < 0 || jenis > 2 || jenis < 0) {
                    System.out.println("input invalid");
                }
                i++;
            }
            System.out.println("Total Pendapatan : Rp " + total);
        }
        else {
            System.out.println("Tutup Aplikasi");    
        }
    }
}
