/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
        double luas,kel,PI;
        int r;
        
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("menghitung luas dan keliling lingkaran");
        System.out.println("masukan jari jari");
        r = hitung.nextInt();
        
        PI = 3.14;
        luas = PI * r * r;
        kel = 2 * PI * r;
        
        System.out.println("luas lingkaran adalah :"+luas);
        System.out.println("keliling lingkaran adalah :"+kel);
    }
}
