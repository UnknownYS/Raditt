/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Persegi {
    public static void main(String[] args) {
        double luas,kel;
        int s;
        
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("menghitung luas dan keliling persegi");
        System.out.println("masukan sisi");
        s = hitung.nextInt();
        
        luas = s * s;
        kel = 4 * s;
        
        System.out.println("luas persegi adalah :"+luas);
        System.out.println("keliling persegi adalah :"+kel);
    }
}
