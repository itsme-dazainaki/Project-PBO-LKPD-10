/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Radaza Putri
 */
import java.util.Scanner;

public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        double sisimiringPhytagoras,sisisikuPhytagoras;
        
        Scanner input = new Scanner(System.in);        
        System.out.println("1.Cek triple pythagoras");
        System.out.println("2.Menentukan sisi miring segitiga");
        System.out.println("3.Menentukan sisi siku-siku segitiga");
        System.out.println("4.Exit");        
        System.out.print("silahkan memilih menunya: ");
        menu = input.nextInt();

        switch(menu){
            case(1):
                System.out.print("sisi alas / a : ");
                int a = input.nextInt();
                System.out.print("sisi tegak / b : ");
                int b = input.nextInt();
                System.out.print("sisi miring / c : ");
                int c = input.nextInt();
                
                int alastegak = (int) Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
                if (c==alastegak) {
                    System.out.println(a+" "+b+" "+c+" merupakan triple Phytagoras");
                } else {
                     System.out.println(a+" "+b+" "+c+" bukan triple Phytagoras");
                }                
                break;
            case(2):
                System.out.print("Sisi alas / a : ");
                int sisimiring = input.nextInt();
                System.out.print("Sisi tegak / b : ");
                int sisitegak = input.nextInt();
                
                sisimiringPhytagoras = Math.sqrt((Math.pow(sisimiring, 2) + (Math.pow(sisitegak, 2))));
                System.out.println("Sisi miring (C) segitiga tersebut yaitu " + sisimiringPhytagoras);
                break;                
            case(3):
                System.out.print("Sisi alas / a : ");
                int sisiA = input.nextInt();
                System.out.print("Sisi miring / c : ");
                int sisiC = input.nextInt();
                                
                sisisikuPhytagoras = Math.sqrt((Math.pow(sisiC, 2) - (Math.pow(sisiA, 2))));
                System.out.println("Sisi siku-siku (B) segitiga tersebut yaitu " + sisisikuPhytagoras);
                break;
            case(4):
                System.exit(0);
                
            default:
                System.out.println("Maaf, kami tidak bisa memprosesnya");
                            
        }
    }
    
}
