/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author SOFTWARE
 */
import java.util.Scanner; 
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Perulangan membuat bintang sebanyak 5kali
        for(int i=0; i <= 5; i++) {
            System.out.println("*****");
        }
        
        //Perulangan membuat Pola Bilangan
        for(int i = 1; i <= 20; i += 2)
        {
            System.out.print( i + " ");
      }
    }
  
        
    }