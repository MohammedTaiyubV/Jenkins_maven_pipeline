package com.louder;
import java.util.Scanner;
/** 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
        Scanner sc = new Scanner(System.in);
       
        System.out.println( "Enter 2 numbers" );
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int result = a+b;

        
        System.out.println("Result: " +(a+b));
    }
}
