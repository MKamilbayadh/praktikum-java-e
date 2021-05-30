package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs2.npm = "19630945";
        mhs2.nama = "Kamil Bayadh";
        mhs2.tanggallahir = formatTanggal.parse("17-01-1994");

        mhs2.tampilkanIdentitasDiri();

        System.out.println("Usia "+mhs2.nama+" adalah "+mhs2.hitungusia()+" tahun");

        System.out.println(mhs2.hitungKali(7, 9));

        mhs2.SapaNama("Kamil Bayadh");

    }
}
