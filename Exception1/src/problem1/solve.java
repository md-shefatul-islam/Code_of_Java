package problem1;

import java.util.Scanner;

public class solve {

    public static void main(String[] args) {
        // while (true) //the input will repeate many time
        int count = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("enter num1");
                int num1 = input.nextInt();
                System.out.println("enter num2");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("result" + num1 + "/" + num2 + "=" + result);
                count = 1;
            } catch (Exception e) {
                System.out.println("exception" + e);
                System.out.println("you must enter an integer,.please try again");
            }
        } while (count == 0);
    }
}
