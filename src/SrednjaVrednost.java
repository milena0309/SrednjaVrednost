
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */
public class SrednjaVrednost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // deklarisati promenljive
       
       int a, b, c;
       double prosek;
       Scanner sc = new Scanner(System.in);
       
       // ucitavanje brojeva
       
       System.out.println("Ucitajte tri broja? ");
       System.out.print("a = ");
            a = sc.nextInt();
       System.out.print("b = ");
            b = sc.nextInt();
       System.out.print("c = ");
            c = sc.nextInt();
            
       // racunanje proseka i vrsim eksplicitnu konverziju
       
       prosek = (double) (a + b + c) / 3;
      
        // pisem rezultat
        System.out.println("Prosek = " + prosek);
        
        
     
    }
    
}
