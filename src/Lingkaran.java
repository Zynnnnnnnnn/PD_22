import jdk.nashorn.internal.ir.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) throws IOException
    {
        //Inputan
        Scanner input = new Scanner(System.in);

        int nominal_uang;
        int Duapuluhribuan;
        int Sepuluhribuan;
        int Seribuan;
        int Limaratusan;
        int Duaratusan;
        int Seratusan;

        System.out.println("Masukkan jumlah uang ");
        nominal_uang = input.nextInt();

        Duapuluhribuan = nominal_uang / 20000;
        nominal_uang = nominal_uang % 20000;

        Sepuluhribuan = nominal_uang / 10000;
        nominal_uang = nominal_uang % 10000;

        Seribuan= nominal_uang / 1000;
        nominal_uang = nominal_uang % 1000;

        Limaratusan = nominal_uang / 500;
        nominal_uang = nominal_uang % 500;

        Duaratusan = nominal_uang / 200;
        nominal_uang = nominal_uang % 200;

        Seratusan= nominal_uang / 100;
        nominal_uang = nominal_uang % 100;

        System.out.println("Pecahan uang:");
        System.out.println("- Dua puluh ribuan: " + Duapuluhribuan);
        System.out.println("- Sepuluh ribuan: " + Sepuluhribuan);
        System.out.println("- Seribu: " + Seribuan);
        System.out.println("- Lima ratusan: " + Limaratusan);
        System.out.println("- Dua ratusan: " + Duaratusan);
        System.out.println("- Seratusan: " + Seratusan);









    }

}