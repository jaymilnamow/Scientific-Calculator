

public class Display {

    public double currentValue = 0;
    public boolean exit = false;

    Calculator calculator = new Calculator();
    User user = new User();


    public void start(){
        currentValue = user.promptUserForInput();
        while(exit == false){
            showCurrentValue();
            System.out.println("Select a function from below:\n \n| 1 ADD | 2 SUBTRACT | 3 MULTIPLY | 4 DIVIDE | 5 SQUARE | 6 SQUAREROOT | 7 EXPONENTIATION | 8 INVERSE | 9 INVERT |");
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
            }



        }
    }


    public void showCurrentValue(){
        System.out.println(currentValue);
    }

    public void clear(){
        currentValue = 0;
    }

    public void displayErr(){
        System.out.println("Err.. can not compute.");
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

}
