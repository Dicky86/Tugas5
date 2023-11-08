package tugaspraktikum4;

import java.util.Scanner;

public class DataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan NPM : ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        int nilaiKehadiran = input.nextInt();

        System.out.print("Nilai Tugas : ");
        int nilaiTugas = input.nextInt();

        System.out.print("Nilai UTS : ");
        int nilaiUTS = input.nextInt();

        System.out.print("Nilai UAS : ");
        int nilaiUAS = input.nextInt();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Menentukan grade dan keterangan
        String grade = "";
        String keterangan = "";

        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        // Output hasil
        System.out.println("\nTampilan Output");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
}