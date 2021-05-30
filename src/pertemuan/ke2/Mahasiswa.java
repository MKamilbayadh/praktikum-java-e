package pertemuan.ke2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {

    String npm, nama;
    Date tanggallahir;

    void  tampilkanIdentitasDiri ()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("NPM " +this.npm);
        System.out.println("Nama Lengkap " +this.nama);
        System.out.println("Tanggal Lahir " + sdf.format(this.tanggallahir));
    }

    int hitungusia()
    {
        Calendar tgllahir = Calendar.getInstance();
        tgllahir.setTime(this.tanggallahir);
        Calendar hariIni = Calendar.getInstance();

        int selisih = hariIni.get(Calendar.YEAR) - tgllahir.get(Calendar.YEAR);
        if(hariIni.get(Calendar.MONTH)< tgllahir.get(Calendar.MONTH)){
            selisih--;
        }else{
            if(hariIni.get(Calendar.MONTH) == tgllahir.get(Calendar.MONTH)
                &&
                hariIni.get(Calendar.DAY_OF_MONTH) < tgllahir.get(Calendar.DAY_OF_MONTH)){
                selisih--;
            }
        }

        return selisih;
    }

    double hitungKali(double param1, double param2)
    {
        return param1 * param2;
    }

    void  SapaNama( String nama)
    {
        JOptionPane.showMessageDialog(
                null,"Hai "+nama,"Ini Judul", JOptionPane.WARNING_MESSAGE);
    }

}
