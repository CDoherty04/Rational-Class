import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter the numerator ----> "); 
    int num1 = input.nextInt();
    
    System.out.print("Enter the denominator --> ");
    int den1 = input.nextInt();

    System.out.print("Enter the second numerator ----> "); 
    int num2 = input.nextInt();
    
    System.out.print("Enter the second denominator --> ");
    int den2 = input.nextInt();

    Rational fract1 = new Rational(num1, den1);
    Rational fract2 = new Rational(num2, den2);

    Rational multiplied = fract1.multiply(fract2);
    Rational divided = fract1.divide(fract2);
    Rational added = fract1.add(fract2);
    Rational subtracted = fract1.subtract(fract2);

    System.out.println(fract1.getRational() + " * " + fract2.getRational() + " = " + multiplied.Simplify());
    System.out.println(fract1.getRational() + " / " + fract2.getRational() + " = " + divided.Simplify());
    System.out.println(fract1.getRational() + " + " + fract2.getRational() + " = " + added.Simplify());
    System.out.println(fract1.getRational() + " - " + fract2.getRational() + " = " + subtracted.Simplify());
  }
} 
//Testing
