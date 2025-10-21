import java.util.Scanner;

public class bioskopLoop23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaTiket = 50000, jmlPengunjung, jmlTiket, totalBayar = 0;
        int totalSehari = 0;

        System.out.print("Jumlah Pengunjung Hari Ini : ");
        jmlPengunjung = input.nextDouble();

        for (int i = 1; i <= jmlPengunjung; i++) {
            System.out.print("Jumlah Tiket Yang Dibeli Pengunjung ke-" + i + " : ");
            jmlTiket = input.nextDouble();

            if (jmlTiket < 0) {
                System.out.println("Jumlah Invalid");
                continue;
            }

            if (jmlTiket > 10) {
                totalBayar = (jmlTiket * hargaTiket) * 0.85;
            }
            else if (jmlTiket > 4) {
                totalBayar = (jmlTiket * hargaTiket) * 0.9;
            }
            else if (jmlTiket < 4) {
                totalBayar = jmlTiket * hargaTiket;
            }
            System.out.println("Total Harga Yang Harus Dibayar Pelanggan Ke-" + i + " : Rp " + (int) totalBayar);
            totalSehari += totalBayar;
        }

        System.out.println("Total pendapatan hari ini : Rp " + totalSehari);

    }   
}