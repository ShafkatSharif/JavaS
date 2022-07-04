
// Question
/*
Implement the following class and test its methods:
_________________________________________________________
Fraction
- numerator: int
- denominator: int
---------------------------------------------
+ Fraction(numerator. int, denominator: int)
+ getNumerator(): int
+ getDenominator(): int
+ setNumerator(numerator: int): void
+ setDenominator(denominator: int): void
---------------------------------------------
+ toString (): String
+ add(fraction: Fraction): void
+ sub(fraction: Fraction): void
+ multiplication(fraction: Fraction): void
+ division(fraction: Fraction): void
_________________________________________________________
void add(Fraction fraction)
>> Adds two Fraction objects and stores the result into calling object. This is how addition is performed for fractions:
1/4+3/5= 1*5+3*4/4*5=17/20
String toString()
>> Returns the value of the fraction in 1 / 2 format where 1 is numerator and 2 is denominator.

>>> Now write a test program, take two Fraction objects. Print both of them. Test add, sub,
multiplication and division methods. Print calling object after each method call.

*/


package labmannualsol;
import java.util.*;

class Fraction{
        private int numerator, denominator;
        Fraction(){}
        Fraction(int numerator , int denominator){
           this.numerator = numerator;
           this.denominator = denominator;
        }
        public int getNumerator() {
            return numerator;
        }
        public int getDenominator()
        {
            return denominator;
        }
        public void setNumerator(int numerator){
            this.numerator = numerator;
        }
        public void setDenominator(int denominator){
            this.denominator = denominator;
        }
        public String toString(){
            return numerator+"/"+denominator;
        }
        public void add(Fraction fr1,Fraction fr2){
            denominator = fr1.denominator*fr2.denominator;
            numerator = fr1.denominator* fr2.numerator+fr2.denominator*fr1.numerator;
        }
        public void sub(Fraction fr1 , Fraction fr2) {
            denominator = fr1.denominator*fr2.denominator;
            numerator = fr1.denominator* fr2.numerator-fr2.denominator*fr1.numerator;
        }
        public void multiplication(Fraction fr1 , Fraction fr2){
            denominator = fr1.denominator*fr2.denominator;
            numerator = fr1.numerator* fr2.numerator;
        }
        public void division(Fraction fr1, Fraction fr2){
             denominator = fr1.denominator* fr2.numerator;
             numerator = fr1.numerator* fr2.denominator;
        }

    }

public class lab6task{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction fr = new Fraction();
        System.out.println("Enter the numerator and denominator of fraction 1: ");
        f1.setNumerator(in.nextInt());
        f1.setDenominator(in.nextInt());
        System.out.println("Enter the numerator and denominator of fraction 2: ");
        f2.setNumerator(in.nextInt());
        f2.setDenominator(in.nextInt());

        fr.add(f1, f2);
        int numerator = fr.getNumerator();
        int denominator = fr.getDenominator();
        System.out.println(f1+"+"+f2+" = "+numerator+"/"+denominator);

        fr.sub(f1, f2);
        numerator = fr.getNumerator();
        denominator = fr.getDenominator();
        System.out.println(f1+"-"+f2+" = "+numerator+"/"+denominator);

        fr.multiplication(f1, f2);
        numerator = fr.getNumerator();
        denominator = fr.getDenominator();
        System.out.println(f1+"*"+f2+" = "+numerator+"/"+denominator);

        fr.division(f1, f2);
        numerator = fr.getNumerator();
        denominator = fr.getDenominator();
        System.out.println(f1+"/"+f2+" = "+numerator+"/"+denominator);

    }
}
