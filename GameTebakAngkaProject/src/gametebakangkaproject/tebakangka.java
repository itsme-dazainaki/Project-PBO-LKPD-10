/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author Radaza Putri
 */

import java.util.Random;
import java.util.Scanner;

public class tebakangka {
    int tebak;
    int angkaRandom;
    
    void tebak(){
        angkaRandom = (int) (Math.random() * 100);
        
        do{
            Scanner n=new Scanner(System.in);
            System.out.print("Masukkan Tebakan Anda : ");
            this.tebak=n.nextInt();
            
            if(tebak==angkaRandom){
            System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            } else if(tebak<angkaRandom){
            System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else{
            System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            }                   
        
        } while (tebak != angkaRandom);
    }
}
