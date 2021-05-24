package id.ac.uniska;

import java.util.Locale;

public class BelajarString {
    public static void main(String[] args) {
        char[] uniskaChar = {'U','N','I','S','K','A'} ;
        String uniskaString = new String(uniskaChar) ;
        System.out.println(uniskaString);


        //######################################################

        String namaDepan        = "Muhammad";
        String namaTengah       = "Rasyid";
        String namaBelakang     = "Ridho";

        String namaLengkap = namaDepan +" " + namaTengah+ " "+namaBelakang;

        System.out.println(namaLengkap.length());//Mengetahui Panjang Karakter
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));//menghilangkan karakter dari depan sebanyak n
        System.out.println(namaLengkap.substring(5, 12));//menghilangkan karakter dari depan sebanyak n
        System.out.println(namaLengkap.replace("Rasyid", "Subhan"));//mereplace target dengan string yang diberikan
        System.out.println(namaLengkap.toUpperCase());//mengubah menjadi huruf besar semua
        System.out.println(namaLengkap.toLowerCase());//mengubah menjadi huruf kecil semua
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
    }
}
