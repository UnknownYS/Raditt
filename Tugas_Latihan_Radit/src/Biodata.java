/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Biodata {
    public static void main(String[] args) {
        System.out.println("Data Diri");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("masukan nama anda : ");
        String nama = masukan.nextLine();
        
        System.out.println("masukan alamat anda : ");
        String alamat = masukan.nextLine();
        
        System.out.println("masukan kelas anda : ");
        String kelas = masukan.nextLine();
        
        System.out.println("masukan absen anda : ");
        int absen = masukan.nextInt();
    }
}
