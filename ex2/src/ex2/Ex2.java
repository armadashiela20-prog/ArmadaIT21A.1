/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int a = sc.nextInt();
        
        System.out.println("Input the 2nd number:");
         int b = sc.nextInt();
         
        System.out.println("Input the 3rd number:");
         int c = sc.nextInt();
         
         int greatest = a;
         if(b > greatest) greatest = b;
         if(c > greatest) greatest = c;
         
         System.out.println("The Greatest number is: " + greatest);
    }
}
    
    

