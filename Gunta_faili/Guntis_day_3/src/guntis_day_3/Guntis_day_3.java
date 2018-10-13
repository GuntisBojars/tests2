/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guntis_day_3;

import java.util.Scanner;

/**
 *
 * @author Marija
 */
public class Guntis_day_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadi skaitli");
        double Komats = sc.nextDouble ();
        if (Komats > 15.5){ 
            System.out.println("##");
        } else {
            System.out.println("#");
        }  
    }
    
}
