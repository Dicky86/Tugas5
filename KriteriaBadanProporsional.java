package tugaspraktikum4;

import java.util.Scanner;

public class KriteriaBadanProporsional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("|====NILAI IMT====|=====KRITERIA=====|");
        System.out.println("|      <18.5      |Berat Badan Kurang|");
        System.out.println("|    18.5-24.9    |Berat Badan Ideal |");
        System.out.println("|     25-29.9     |Berat Badan Lebih |");
        System.out.println("|     30-39.9     |       Gemuk      |");
        System.out.println("|       >=40      |   Sangat Gemuk   |");
        System.out.println("|=================|==================|");
        
        System.out.print("Masukkan Berat Badan (kg): ");
        double bb = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (m): ");
        double tb = input.nextDouble();

        double imt = bb / (tb * tb);
        
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt < 25) {
            kriteria = "Berat Badan Ideal";
        } else if (imt < 30) {
            kriteria = "Berat Badan Lebih";
        } else if (imt < 40) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("IMT Anda adalah          : " + imt);
        System.out.println("Kriteria                 : " + kriteria);
    }
}
