import java.lang.Math;

public class Calculator {

    public double squareRoot(double n) {
        return Math.sqrt(n);
    }

    public long factorial(int number) {
        if (number < 0) {
            throw new ArithmeticException(number + " is negative");
        }
        long fact = 1;
        for (int i = 1; i <= number; ++i) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double x) {
        return Math.log1p(x);
    }

    public double power(double b, double e) {
        return Math.pow(b,e);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.factorial(10));
    }
}