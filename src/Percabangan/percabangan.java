package Percabangan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //if
        //cek syarat pembuatan KTP
        int usia;
        System.out.println("Masukkan usia anda : ");
        usia = Integer.parseInt(br.readLine());

        if (usia >= 17) {
            System.out.println("Sudah memenuhi syarat");
        } else {
            System.out.println("Tidak memenuhi syarat");
        }

        //if-else-if
        //Cek status kelulusan MK berdasarkan nim dan nilai UAS
        int nilaiUAS;
        String nim;
        System.out.println("Masukkan NIM anda");
        nim = br.readLine();
        System.out.println("Masukkan nilai UAS anda");
        nilaiUAS = Integer.parseInt(br.readLine());

        //Jika nilai 80,70,65 = lulus , dibawah 65 = tidak lulus
        if (nim.equalsIgnoreCase("22410100055") && nilaiUAS == 80) {
            System.out.println("LULUS");

        } else if (nim.equalsIgnoreCase("22410100055") && nilaiUAS == 70)
            System.out.println("LULUS");

        else if (nim.equalsIgnoreCase("22410100055") && nilaiUAS == 65) {
            System.out.println("LULUS");

        } else if (nim.equalsIgnoreCase("22410100055") && nilaiUAS < 65) {
            System.out.println("TIDAK LULUS");

        } else {
            System.out.println("MAAF DATA TIDAK DITEMUKAN");
        }


        //nested if
        //Cek menu yang dipiih (makanan/minuman)
        //makanan =snack,nasi bungkus
        //minuman = kopi,teh,air mineral

        String menu,jenis;
        System.out.println("Masukkan menu (Makanan/minuman)" );
        menu= br.readLine();
        System.out.println("Masukkan jenis menu \nMakanan : Snack, Nasi Bungkus \n" + "Minuman : Kopi,Teh,Air Mineral. " +
                "\nPilih : ");

        jenis = br.readLine();
        if (menu.equalsIgnoreCase("Makanan")){
            if (jenis.equalsIgnoreCase("Snack"))
                System.out.println("Harganya Rp.5.000");
             else {
                System.out.println("Harganya Rp.8.000");
            }
        }else if (menu.equalsIgnoreCase("Minuman")){
            if (jenis.equalsIgnoreCase("Kopi")) {
                System.out.println("Harganya Rp.5000");
            } else if (jenis.equalsIgnoreCase("Teh")) {
                System.out.println("Harganya Rp.4000");
            }else {
                System.out.println("Harganya Rp.3000");
        }

        }

    }
}