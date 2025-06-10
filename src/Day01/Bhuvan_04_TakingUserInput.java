package Day01;

import java.util.Scanner;
public class Bhuvan_04_TakingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking User Input !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number ");
        int num2=sc.nextInt();
        System.out.println("Sum of Two Number :"+(num1+num2));

    }
}
