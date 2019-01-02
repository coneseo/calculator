package my.calculator;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        add add = new add(num1, num2);
        Minus minus =  new Minus(num1, num2);
        Multiple multiple = new Multiple(num1, num2);

        System.out.println(add);
        System.out.println(minus);
    }
}
