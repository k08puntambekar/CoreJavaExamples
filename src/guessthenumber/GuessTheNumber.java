package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int a;
        int trials=0;

        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random()*100+1);
        //System.out.println(random);

        do {
            System.out.println("Enter a number between 1 and 100 : ");
            a = sc.nextInt();

            trials++;

            if (random > a) {
                System.out.println("Number is high.");
            } else if (random < a) {
                System.out.println("Number is low.");
            } else {
                System.out.println("Number is correct. It took " + trials + " tries to guess it right!");
            }
        }while(random != a);
    }
}
