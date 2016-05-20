public class Calculator {

    private double storedValue = 0;

    public double getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(double storedValue) {
        this.storedValue = storedValue;
    }


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

    public double sin(double a){
        a = Math.toRadians(a);
        a = Math.round (Math.sin(a) * 10000.0) / 10000.0;
        return a;
    }

    public double cos(double a){
        a = Math.toRadians(a);
        a = Math.round (Math.cos(a) * 10000.0) / 10000.0;
        return a;
    }

    public double tan(double a){
        a = Math.toRadians(a);
        a = Math.round (Math.tan(a) * 10000.0) / 10000.0;
        return a;
    }

    public double arcSin(double a){
        a = Math.round (Math.toDegrees(Math.asin(a)) * 10000.0) / 10000.0;
        return a;
    }

    public double arcCos(double a){
        a = Math.round (Math.toDegrees(Math.acos(a)) * 10000.0) / 10000.0;
        return a;
    }

    public double arcTan(double a){
        a = Math.round (Math.toDegrees(Math.atan(a)) * 10000.0) / 10000.0;
        return a;
    }

    public double log(double a){
        return Math.round((Math.log10(a)) * 10000.0) / 10000.0;
    }

    public double inverseLog(double a){
        return Math.round((Math.pow(10,a)) * 10000.0) / 10000.0;
    }

    public double naturalLog(double a){
        return Math.round((Math.log(a)) * 10000.0) / 10000.0;
    }

    public double inverseNaturalLog(double a){
        return Math.round((Math.exp(a)) * 10000.0) / 10000.0;
    }

    public String doBinary(double displayType){
        return Integer.toBinaryString((int)displayType);
    }

    public String doOctal(double displayType){
        return Integer.toOctalString((int)displayType);
    }

    public String doHexadecimal(double displayType){
        return Double.toHexString(displayType);
    }

    public double doRadians(double a){
        return Math.toRadians(a);
    }

    public double doDegrees(double a){
        return Math.toDegrees(a);
    }

}
