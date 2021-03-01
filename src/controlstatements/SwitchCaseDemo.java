package controlstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int i,j;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter i value : ");
        i = sc.nextInt();
        System.out.println("Enter j value : ");
        j = sc.nextInt();

        System.out.println("Enter Operation value (+,-,/,*) : ");
        operator = sc.next().charAt(0);

        switch(operator) {
            case '+' :
                System.out.println("Addition of i and j is : " + (i+j));
                break;

            case '-' :
                System.out.println("Subtraction of i and j is : " + (i-j));
                break;

            case '/' :
                System.out.println("Division of i and j is : " + (i/j));
                break;

            case '*' :
                System.out.println("Multiplication of i and j is : " + (i*j));
                break;

            default :
                System.out.println("No operations can be performed!");
        }

    }

}
