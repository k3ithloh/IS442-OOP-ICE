//import java.lang.reflect.GenericDeclaration;

public class Rational {
    private int numerator;
    private int denominator;

    //a and b
    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    //b
    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }
    /**
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }
    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    int gcd(int a, int b) {
        if (a == b) return a; 
        if (a < b) return gcd(b, a); 
        return gcd(a - b, b);
    }

    //c
    public Rational add(Rational other) {
        int newNum = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDen = this.denominator * other.denominator;
        return new Rational(newNum, newDen);
    }

    public Rational subtract(Rational other) {
        int newNum = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDen = this.denominator * other.denominator;
        return new Rational(newNum, newDen);
    }

    public Rational multiply(Rational other) {
        int newNum = this.numerator * other.numerator;
        int newDen = this.denominator * other.denominator;
        return new Rational(newNum, newDen);
    }

    public Rational divide(Rational other) {
        int newNum = this.numerator * other.denominator;
        int newDen = this.denominator * other.numerator;
        return new Rational(newNum, newDen);
    }

    //d
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
