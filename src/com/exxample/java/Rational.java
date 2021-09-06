package com.exxample.java;

public class Rational {
	
	private int numerator;
	private int denominator;
	
	private static final int getGCD(int x, int y) {
		int r;
		while (y != 0) {
		    r = x % y;
		    x = y;
		    y = r;
		}
		return x;
	}
	
	private static final Rational checkRational(Rational rational) {
        if (rational == null) {
            throw new NullPointerException("Must supply a non-null Rational value");
        }
        return rational;
    }
	
	//constructor
	public Rational(int numerator, int denominator){
		if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
		
		// reduce the value at construct time....
        int div = numerator == 0 ? 1 : getGCD(numerator, denominator);
       
        this.numerator = numerator/div;
        this.denominator = numerator == 0 ? 1 : denominator/div;
	}
	
	public Rational(Rational other){
		this(other.numerator, other.denominator);
    }
	
	//getter
	public int getNumerator() {
	    return this.numerator;
	}

	public int getDenominator() {
	    return this.denominator;
	}
	
	//setter
	public void setNumerator(int numerator){
	   this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void setRational(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
    }
	
	@Override
    public String toString(){
		if (denominator == 1)
			return numerator + "";
		else
			return numerator + " / " + denominator;
    }       

	@Override
    public boolean equals(Object other) {
        return other instanceof Rational
              && ((Rational)other).numerator == numerator
              && ((Rational)other).denominator == denominator;
    }

    public int compareTo(Rational other) {
        checkRational(other);
        Rational difference = subtract(other);
        if (difference.numerator > 0) {
            return 1;
        }
        if (difference.numerator < 0) {
            return -1;
        }
        return 0;
    }
    
    //Rational Subtraction
    public Rational subtract(Rational other){
    	checkRational(other);
        return new Rational(numerator * other.denominator - other.numerator * denominator, denominator* other.denominator);
    }
    
    //Rational Addition            
    public Rational addition(Rational other){
    	checkRational(other);
        return new Rational(other.numerator * denominator + numerator * other.denominator, denominator * other.denominator);
    }
    
    //Multiplication       
    public Rational multiplication(Rational other){
    	checkRational(other);
        return new Rational(numerator * other.numerator, denominator * other.denominator);
    }
    
    //Division        
    public Rational division(Rational other){
    	checkRational(other);
        return new Rational(numerator * other.denominator, denominator * other.numerator);
    }
    
    public boolean lessThan(Rational other) {
        return(numerator * other.denominator < denominator * other.numerator);
    }
    
    public boolean greterThan(Rational other){
        return(numerator * other.denominator > denominator * other.numerator);
    }
    
    public boolean lessThanEqualTo(Rational other) {
        return(numerator * other.denominator <= denominator * other.numerator);
    }
    
    public boolean greaterThanEqual(Rational other) {
        return(numerator * other.denominator >= denominator * other.numerator);
    }
}
