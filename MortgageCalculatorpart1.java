package project.lab.Assesment;

import java.util.Scanner;
public class MorgageCalculator {
public static void main (String[] args){

    Scanner scanner = new Scanner (System.in);

    System.out.print("Entry the loan amount=");
    int p = scanner.nextInt();

    System.out.print("Enter the rate amonut=");
    float r =scanner.nextFloat();

    System.out.print("Enter the time you have the loan=");
    int m = scanner.nextInt();
 float interest = ((r/100)/12);
 int n = (m*12);
 double pow = Math.pow((1+interest),n);
 double payable = p*((interest*pow)/(pow-1.00));
 System.out.println("payeblea amount"+payable);

 
}  
    
}
