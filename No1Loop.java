/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no.pkg1.loop;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class No1Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program For Loop Bilangan Ganjil");
        System.out.print("Silahkan Masukkan Bilangan : ");
        int n = s.nextInt();
        System.out.println("Deret angka bilangan ganjil yaitu :");
          int star = 1;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i + "");
        }  
    }
    
}
