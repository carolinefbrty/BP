/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("While Java");
        System.out.print("Masukkan Bilangan : ");
        int n = s.nextInt();
        System.out.println("Deret angka ganjil adalah");
        int star = 1;
        while (n >= star) {
            System.out.println(star + " ");
            star += 2;
        }    
    }
    
}
