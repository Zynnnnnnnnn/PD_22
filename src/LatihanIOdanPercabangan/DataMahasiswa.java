package LatihanIOdanPercabangan;

//import Lib
import java.io.BufferedReader;
import java.io.IOException;
//import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataMahasiswa {
    public static void main(String[] args)
    {
        //step 3 deklarasi class bufferreader -  memasukkannya sebelum try
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //step 4 deklarasi variabel
        String nim,nama,prodi;
        int semester,sksAmbil;

        //step 2 masukkan error handLing

        //error handling pake catch
        try {
            //step 5 pengerjaan logikanya program - didalam try
            System.out.println("---DATA MAHASISWA---"); //header
            //input
            System.out.print("NIM : ");
            nim = br.readLine();
            System.out.print("NAMA : ");
            nama = br.readLine();
            System.out.print("PRODI : ");
            prodi = br.readLine();
            System.out.print("SEMESTER : ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("JUMLAH SKS YANG DIAMBIL : ");
            sksAmbil = Integer.parseInt(br.readLine());

            //output
            System.out.println("\nBerikut Data mahasiswa \n");
            System.out.println("NIM MAHASISWA : " + nim);
            System.out.println("NAMA MAHASISWA : " + nama);
            System.out.println("PRODI MAHASISWA : " + prodi);
            System.out.println("MAHASISWA SEMESTER : " + semester);
            System.out.println("JUMLAH SKS YANG DIAMBIL : " + sksAmbil);
            System.out.println("SEMANGAT!!!");





        } catch (Exception exp) {
            //kondisi ada error-apa yang ditampilkan

        }

    }
}
