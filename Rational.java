public class Rational
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Rational(int theNumerator, int theDenominator)
    {
        numerator = theNumerator;
        denominator = theDenominator;
         
    }

    public int getDenominator() {
      return denominator;
    }

    public int getNumerator() {
      return numerator;
    }
    
    public String getDecimal() {
        return numerator + "/" + denominator + " equals " + (double)numerator/denominator;
    }
    
    public String getRational() {
      return numerator + "/" + denominator;
    }
  
    public Rational multiply(Rational other) {
        // IMPLEMENT THIS METHOD
        int newNumerator = numerator * other.getNumerator();
        int newDenominator = denominator * other.getDenominator();
        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }

    public Rational divide(Rational other) {
        // IMPLEMENT THIS METHOD
        int newNumerator = numerator * other.getDenominator();
        int newDenominator = denominator * other.getNumerator();
        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }

    public Rational add(Rational other) {
        // IMPLEMENT THIS METHOD
        int num1 = numerator * other.getDenominator();
        int num2 = other.getNumerator() * denominator;
        int newDenominator = denominator * other.getDenominator();
        int newNumerator = num1 + num2;
        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }

    public Rational subtract(Rational other) {
        // IMPLEMENT THIS METHOD
        int num1 = numerator * other.getDenominator();
        int num2 = other.getNumerator() * denominator;
        int newDenominator = denominator * other.getDenominator();
        int newNumerator = num1 - num2;
        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }

    public String Simplify(){

    int gcd = 0;

    for(int i=1; i <= numerator && i <= denominator; i++) 
      {
        if(numerator%i == 0 && denominator%i==0) {
          gcd = i;
        }
      }
    return numerator/gcd + "/" + denominator/gcd;
    }
     
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + "/" + denominator;
    
    }
}