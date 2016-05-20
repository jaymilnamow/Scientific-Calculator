

public class Calculator {

    public double storedValue;

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double square(double a){
        return Math.pow(a,2);
    }

    public double squareRoot(double a){
        return Math.sqrt(a);
    }

    public double exponentiation(double a, double b){
        return Math.pow(a,b);
    }

    public double inverse(double a){
        return 1/a;
    }

    public double invert(double a){
        return -(a);
    }


}
