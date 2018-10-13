/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guntis;

import java.util.Scanner;

/**
 *
 * @author Marija
 */
public class Guntis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hello world");
        int skaitlis = 5; // vesels skaitlis
        skaitlis = 8 + 27;
        System.out.println(skaitlis);
        
        double arKomatu2 = 4.4; 
        System.out.println(arKomatu2);
        float arKomatu = 5.3f; 
        System.out.println(arKomatu);
        char simbols = '8';
        char simbolsArSkaitli = '9';
        String SimboluVirkne = "Si ir virkne";
        Scanner sc = new Scanner(System.in); 
        sc.nextLine();
        SimboluVirkne = sc.nextLine();
        System.out.println(SimboluVirkne);             
        System.out.println("Sveiks, draugs. Ka Tevi sauc?");
    Scanner sc = new Scanner (System.in);
    String CilvekaVards = sc.nextLine ();
        System.out.println("Prieks Tevi redzet, " + CilvekaVards);
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadiet vienu skaitli");
        int skaitlis1 = sc.nextInt();
        System.out.println("Ievadiet otru skaitli");
        int skaitlis2 = sc.nextInt ();
        int rezultats = skaitlis1 + skaitlis2;         
        System.out.println("Rezultats ir " + rezultats);
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadi gada skaitli, kura Tu esi dzimis?");
        int skaitlis1 = sc.nextInt ();
        int rezultats = 2018 - skaitlis1;
        System.out.println("Tev sobrid ir " + rezultats + " gadu" );*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadu so gadu");
        int a = sc.nextInt();
        System.out.println("Ievadi, kura gada esi dzimis");
        int b = sc.nextInt();
        dzimsanasGads(a, b);
    }

    public static void dzimsanasGads(int skaitlis1, int skaitlis2) {
        int rezultats = skaitlis1 - skaitlis2;
        System.out.println(rezultats);
    }
    
    
}
