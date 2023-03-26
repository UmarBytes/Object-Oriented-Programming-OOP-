                                                    //Name : Muhammad Umar Farooq
                                                    //ID : 212370006

import java.util.Scanner;
public class Rational{

    private int numerator;
    private int denominator;

    Rational(){

        numerator = 1;
        denominator = 2;

    }//no perameter

    Rational(int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;

    }// tow perameterize cons........

    public void setNumerator(int numerator){

        this.numerator = numerator;

    }//setter

    public void setDenominator(int denominator){
        this.denominator = denominator;
    
    }//setter

      public int getNumerator(){

        return numerator;

    }//getter

    public int getDenominator(){

        return denominator;

    }//setter

    public Rational addition(Rational ob){
    
        int  num_add = numerator * ob.denominator + ob.numerator * denominator;
        int denom_add = denominator * ob.denominator;
    
        return new Rational(num_add, denom_add);

    }//add

    public Rational subtraction(Rational ob){
    
        int num_sub = numerator * ob.denominator - ob.numerator * denominator;
        int denom_sub = denominator  * ob.denominator;

        return new Rational(num_sub, denom_sub);

    }//subtract

    public Rational multiplication(Rational ob){
    
        int num_mul = numerator * ob.numerator;
        int denom_mul = denominator * ob.denominator;
    
        return  new Rational(num_mul, denom_mul);

    }// Multiplation

    public Rational division(Rational ob){

        int num_divs = numerator / ob.numerator;
        int denom_divs = denominator / ob.denominator;

        return new Rational(num_divs, denom_divs);

    }// division

        //string method to print String in Rational Form
        public String stringRational(){
         //return "abc" + numerator +   " / "  + denominator + "xyz"; 
            return "abc"  +   " / "  + "xyz"; 
        }// for

    public String toString(){

        return  numerator +  " / " + denominator ;

    }//String method to Place the numirator and denomirator
}//class