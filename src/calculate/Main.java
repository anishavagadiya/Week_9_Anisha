package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        //c1.calculateResult(10, 20, '+');
        char symbol1;
        int a, b;
        Scanner s1 = new Scanner(System.in);

        do {
            // ask users to enter numbers
            System.out.println("Enter first number:= ");
            a = s1.nextInt();
            System.out.println("Enter second number: =");
            b = s1.nextInt();
            // ask users to enter operator
            System.out.println("Choose an operator: +, -, *, or /");
            char symbol = s1.next().charAt(0);
            c1.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” : ");
            symbol1 = s1.next().charAt(0);

        } while (symbol1 == 'Y');
        s1.close();
    }
}


