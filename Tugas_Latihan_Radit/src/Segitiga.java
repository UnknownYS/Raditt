/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) {
        System.out.println("menghitung luas dari bangun datar segitiga");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("masukan alas : ");
        int alas = masukan.nextInt();
                
        System.out.println("masukan tinggi : ");
        int tinggi = masukan.nextInt();
        int luas = alas * tinggi/2;
        
        System.out.println("hasilnya adalah :"+luas);
    } 
}
