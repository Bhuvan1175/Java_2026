package Day01;

import java.util.Scanner;
public class Bhuvan_07_CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject1 Marks : ");
        float subject1=sc.nextInt();
        System.out.println("Enter Subject2 Marks : ");
        float subject2=sc.nextInt();
        System.out.println("Enter Subject3 Marks : ");
        float subject3=sc.nextInt();
        double cgpa=((subject1+subject2+subject3)/30);
        System.out.println("CGPA : "+cgpa);
    }
}
