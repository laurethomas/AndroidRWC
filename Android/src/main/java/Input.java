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

public class Input {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
     System.out.print("How old are you?");
     
    int number = input.nextInt();
    
    input.close();
    }
    
}
