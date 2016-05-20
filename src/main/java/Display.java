import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class Display {

    public double currentValue = 0;
    public boolean exit = false;

    Calculator calculator = new Calculator();
    User user = new User();

    public String displayMode = "decimal";

    public void start(){
        currentValue = user.promptUserForInput();
        while(exit == false){
            if(displayMode.equals("binary")){
                System.out.println(calculator.doBinary(currentValue));
            } else if(displayMode.equals("octal")){
                System.out.println(calculator.doOctal(currentValue));
            } else if(displayMode.equals("hexadecimal")){
                System.out.println(calculator.doHexadecimal(currentValue));
            } else if(currentValue == Infinity||currentValue == NaN) {
                displayErr();
            } else {
                showCurrentValue();
            }
            System.out.println("Select a function from below:\n \n| 1 ADD | 2 SUBTRACT | 3 MULTIPLY | 4 DIVIDE | 5 SQUARE | 6 SQUAREROOT | 7 EXPONENTIATION | 8 INVERSE | 9 INVERT | \n| 10 SIN | 11 COS | 12 TAN | 13 ARC SIN | 14 ARC COS | 15 ARC TAN | 16 LOG | 17 INVERSE LOG | 18 NATURAL LOG | 19 INVERSE NATURAL LOG | \n| 20 BINARY | 21 OCTAL | 22 DECIMAL | 23 HEXADECIMAL | 24 STORE VALUE TO MEMORY | 25 RESET VALUE IN MEMORY | 26 DISPLAY VALUE IN MEMORY | 27 RADIANS | 28 DISPLAY IN DEGREES | 29 CLEAR |");
            switch(user.chooseOperation()){
                case 1:
                    doSum();
                    break;
                case 2:
                    doSubtract();
                    break;
                case 3:
                    doMultiply();
                    break;
                case 4:
                    doDivide();
                    break;
                case 5:
                    doSquare();
                    break;
                case 6:
                    doSquareRoot();
                    break;
                case 7:
                    doExponentiation();
                    break;
                case 8:
                    doInverse();
                    break;
                case 9:
                    doInvert();
                    break;
                case 10:
                    doSin();
                    break;
                case 11:
                    doCos();
                    break;
                case 12:
                    doTan();
                    break;
                case 13:
                    doArcSin();
                    break;
                case 14:
                    doArcCos();
                    break;
                case 15:
                    doArcTan();
                    break;
                case 16:
                    doLog();
                    break;
                case 17:
                    doInverseLog();
                    break;
                case 18:
                    doNaturalLog();
                    break;
                case 19:
                    doInverseNaturalLog();
                    break;
                case 20:
                    displayInBinary();
                    break;
                case 21:
                    displayInOctal();
                    break;
                case 22:
                    displayInDecimal();
                    break;
                case 23:
                    displayInHexadecimal();
                    break;
                case 24:
                    storeValueInMemory();
                    break;
                case 25:
                    resetValueInMemory();
                    break;
                case 26:
                    displayValueInMemory();
                    break;
                case 27:
                    displayInRadians();
                    break;
                case 28:
                    displayInDegrees();
                    break;
                case 29:
                    clear();
                    break;
            }
        }
    }


    public void showCurrentValue(){
        System.out.println(currentValue);
    }

    public void clear(){
        displayInDecimal();
        resetValueInMemory();
        currentValue = 0;
    }

    public void displayErr(){
        System.out.println("Err.. Beep beep: can not compute.");
    }

    public void doSum(){
        currentValue = calculator.sum(currentValue, user.promptUserForInput());
    }

    public void doSubtract(){
        currentValue = calculator.subtract(currentValue, user.promptUserForInput());
    }

    public void doMultiply(){
        currentValue = calculator.multiply(currentValue, user.promptUserForInput());
    }

    public void doDivide(){
        currentValue = calculator.divide(currentValue, user.promptUserForInput());
    }

    public void doSquare(){
        currentValue = calculator.square(currentValue);
    }

    public void doSquareRoot(){
        currentValue = calculator.squareRoot(currentValue);
    }

    public void doExponentiation(){
        currentValue = calculator.exponentiation(currentValue, user.promptUserForInput());
    }

    public void doInverse(){
        currentValue = calculator.inverse(currentValue);
    }

    public void doInvert(){
        currentValue = calculator.invert(currentValue);
    }

    public void doSin(){
        currentValue = calculator.sin(currentValue);
    }

    public void doCos(){
        currentValue = calculator.cos(currentValue);
    }

    public void doTan(){
        currentValue = calculator.tan(currentValue);
    }

    public void doArcCos(){
        currentValue = calculator.arcCos(currentValue);
    }

    public void doArcSin(){
        currentValue = calculator.arcSin(currentValue);
    }

    public void doArcTan(){
        currentValue = calculator.arcTan(currentValue);
    }

    public void doLog(){
        currentValue = calculator.log(currentValue);
    }

    public void doInverseLog(){
        currentValue = calculator.inverseLog(currentValue);
    }

    public void doNaturalLog(){
        currentValue = calculator.naturalLog(currentValue);
    }

    public void doInverseNaturalLog(){
        currentValue = calculator.inverseNaturalLog(currentValue);
    }

    public void storeValueInMemory(){
        calculator.setStoredValue(currentValue);
    }

    public void resetValueInMemory(){
        calculator.setStoredValue(0);
    }

    public void displayValueInMemory(){
        currentValue = calculator.getStoredValue();
    }

    public void displayInBinary(){
        displayMode = "binary";
    }

    public void displayInOctal(){
        displayMode = "octal";
    }

    public void displayInDecimal(){
        displayMode = "decimal";
    }

    public void displayInHexadecimal(){
        displayMode = "hexadecimal";
    }

    public void displayInRadians(){
        currentValue = calculator.doRadians(currentValue);
    }

    public void displayInDegrees(){
        currentValue = calculator.doDegrees(currentValue);
    }
}
