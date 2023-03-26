                    //Name : Muhammad Umar Farooq
                    //ID : 212370006

import java.util.Scanner;
public class RationalTest{

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("PleaseEnter numerator for the first rational number: ");
        int numerator1 = input.nextInt();
        System.out.print("please Enter denominator for the first rational number: ");
        int denominator1 = input.nextInt();
        System.out.print("please Enter a numerator for the second rational number: ");
        int numerator2 = input.nextInt();
        System.out.print("please Enter a non-zero denominator for the second rational number: ");
        int denominator2 = input.nextInt();


        Rational ob1 = new Rational(numerator1, denominator1);
        Rational ob2 = new Rational(numerator2, denominator2);

        System.out.println("First rational number is: " + ob1);
        System.out.println("Second rational number is: " + ob2);
        System.out.println("Addition of the rational number is: " + ob1.addition(ob2));
        System.out.println("Subtraction of the rational number is: " + ob1.subtraction(ob2));
        System.out.println("Multiplication of the rational number is: " + ob1.multiplication(ob2));
        System.out.println("Division of the rational number is: " + ob1.division(ob2));
        System.out.println("String numerator and String denominator are : "+ ob1.stringRational());
        

    }//main
}//class