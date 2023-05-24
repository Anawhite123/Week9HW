package calculate;
//Write a “main” method into main class. It has scanner that takes user
//        input. Also write the logic that it ask user to “Enter first Number:”,
//        “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
//        enter + symbol result like “Addition of 5 and 10 is: 15” and respective
//        for other symbol.
//        5. With the result it’s also print one more message “Would you like to do
//        more calculation Please enter “Y” or “N” :” (Hint use while loop if user
//        enter Y program asking the user to enter First Number, and if user enter
//        N program should terminate)

import java.util.Scanner;

public class Main  {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator r = new Calculator();
    System.out.println("Enter number 1 : ");
    int a = sc.nextInt();//use this method to add value in scanner class
    System.out.println("Enter number 2 :");
    int b = sc.nextInt();
    System.out.println("Enter a symbol");
    char symbol = sc.next().charAt(0);//use this for symbol
    r.calculateresult(a,b,symbol);
    if(symbol=='+'){
        r.addition(a,b);
    } else if (symbol=='-') {
        r.subtraction(a,b);
    } else if (symbol=='*') {
        r.multiplication(a, b);
    } else if (symbol=='/') {
        r.division(a,b);
    }else{
        System.out.println("invalid");

}


}

}
