package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs.npm = "19630947";
        mhs.nama = "M Kamil Bayadh";
        mhs.tanggallahir =  formatTanggal.parse ("17-01-1994");

        System.out.println("NPM " +mhs.npm);
        System.out.println("Nama " +mhs.nama);
        System.out.println("TANGGAL LAHIR " +formatTanggal.format(mhs.tanggallahir));


        System.out.println("===================================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19630945";
        mhs2.nama = "Kamil Bayadh";
        mhs2.tanggallahir =  formatTanggal.parse ("09-08-2002");

        System.out.println("NPM " +mhs2.npm);
        System.out.println("Nama " +mhs2.nama);
        System.out.println("TANGGAL LAHIR " +formatTanggal.format(mhs2.tanggallahir));

    }
}
