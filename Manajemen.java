package tugaspraktikum4;

import java.util.Scanner;

public class Manajemen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        int totalPembelian = input.nextInt();

        double potongan = 0;

        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.20 * totalPembelian;
        }

        double jumlahDibayarkan = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + (int)potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + (int)jumlahDibayarkan);

        input.close();
    }
}