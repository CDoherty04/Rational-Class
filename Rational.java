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
    
    public String getDecimal() {
        return numerator + "/" + denominator + " equals " + (double)numerator/denominator;
    }
    
    public String getRational() {
      return numerator + "/" + denominator;
    }
  
  /*public void multiply(Rational other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }*/

    public String getGCF(){

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
        return numerator + " / " + denominator;
    
    }
}