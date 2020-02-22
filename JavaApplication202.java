
package javaapplication202;
import java.util.*;
public class JavaApplication202 {

public static void main ( String [] args ){

Scanner sc = new Scanner(System.in);


System.out.println("Program to calculate avg, sum of three numbers");

System.out.println("Enter 3 numbers, press enter after each number");

 double n1= sc.nextDouble();
double n2= sc.nextDouble();
double n3= sc.nextDouble();

double sum, avg; 

sum = n1 + n2 + n3;
avg= sum/3 ;

System.out.println("The sum = " +sum+ "  and the avg = "+avg);
}
}

