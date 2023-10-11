/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no.pkg2.pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class No2DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Angka :");
        int a = s.nextInt();
//        
//        while loop
        int i=1,j = 1;
        while (a >= i) {
            while (i >= j) {
                System.out.print(j + " ");
                j++;
            }
            j = 1;
            System.out.println(" ");
            i++;   
        }
    
    }
    
}
