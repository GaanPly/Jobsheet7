import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kopi, teh, roti,
            HargaKopi   = 12000, 
            HargaTeh    = 7000, 
            HargaRoti   = 20000,
            totalHarga;

        String namaPelanggan;

        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal untuk keluar'): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("jumlah kopi : ");
            kopi = input.nextInt();
            System.out.print("jumlah teh  : ");
            teh = input.nextInt();
            System.out.print("jumlah roti : ");
            roti = input.nextInt();

            totalHarga = (kopi*HargaKopi) + (teh*HargaTeh) + (roti*HargaRoti);
            System.out.println("Total Bill  : Rp " + totalHarga);
            input.nextLine();
        } while(true);

        System.out.println("Transaksi Selesai");
    }
}