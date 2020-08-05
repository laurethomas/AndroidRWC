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
public class Populate {

    
    public static void main(String[] args) {
    
        
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter # of elemets you want in array:");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
}
}