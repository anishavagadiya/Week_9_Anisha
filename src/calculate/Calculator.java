package calculate;

public class Calculator {

    //Declare all method Instance Method with no return with parameters
    public void Addition(int a, int b) {
        int result = a + b;
        System.out.println(result);

    }

    public void Subtraction(int a, int b) {
        int result = a - b;
        System.out.println(result);

    }

    public void Division(int a, int b) {
        int result = a / b;
        System.out.println(result);

    }

    public void Multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);


    }

    public void calculateResult(int a, int b, char symbol){
        switch (symbol) {

            case '+':
                Addition(a, b);
                break;
            case '-':
                Subtraction(a, b);
                break;
            case '*':
                Multiplication(a, b);
                break;
            case '/':
                Division(a, b);
                break;

            default:
                System.out.println("Invalid Input");
        }

    }

    }


