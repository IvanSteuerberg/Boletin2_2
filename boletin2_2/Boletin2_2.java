
package boletin2_2;

//@author irodriguezsteuerberg

import java.util.Scanner;

 
public class Boletin2_2 {

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Introduce os graos centígrados");
float C = sc.nextFloat();
float F = (C*9/5)+32;
float K = C+273;
System.out.println(C+" graos centígrados son "+F+" Fahrenheit e "+K+" Kelvin");
        
        
    }
    
}
