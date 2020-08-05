/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author druzb
 */
import java.util.Scanner;

public class InputTwo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many liters of water do you drink a day?");
    float question1 = input.nextFloat();
    System.out.print("You wrote " + question1);
    
    System.out.print("How old are you?");
    double question2 = input.nextDouble();
    System.out.print("You wrote " + question2);
     
    System.out.print("Are you having a good day?");
    String question3 = input.next();
    System.out.print("You wrote " + question3);
    
    input.close();
     
    
    }
    
}
