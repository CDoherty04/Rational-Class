import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Enter the numerator ----->"); 
    int numerator = scanner.nextInt();
    
    System.out.println("Enter the denominator ----->");
    int denominator = scanner.nextInt();

    Rational fract = new Rational(numerator, denominator);
  fract.toString();
  System.out.println(fract.getDecimal());
  System.out.println(fract.getRational());
  System.out.println("and reduces to "+ fract.getGCF());
  }
} 
//Testing
