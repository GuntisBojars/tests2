/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guntis4;

import java.util.Scanner;

/**
 *
 * @author Marija
 */
public class Guntis4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadi 1.skaitli");
        int a = sc.nextInt ();
        System.out.println("Ievadi 2.skaitli");
        int b = sc.nextInt ();
        JaunaKlase Summa = new JaunaKlase ();
        int rezultats = Summa.Saskaitit (a, b);
        System.out.println(rezultats);
        // TODO code application logic here
        
        
        
    Guntis
    
}
