package id.ac.uniska;

import javax.swing.*;
import java.util.Scanner;

public class BelajarInput {

    public static void main(String[] args) {

        String namalengkap; //null

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama Anda : ");
        namalengkap = input.nextLine(); //string

        System.out.println("Nama Lengkap Anda Adalah "+namalengkap);
    }

}
