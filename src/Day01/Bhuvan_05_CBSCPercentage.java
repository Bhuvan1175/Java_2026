package Day01;

import java.util.Scanner;
public class Bhuvan_05_CBSCPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name :");
        String studentName=sc.nextLine();
        System.out.println("Enter "+studentName+" Mathematics Marks : ");
        int mathematics=sc.nextInt();
        System.out.println("Enter "+studentName+"Physics Marks : ");
        int physics=sc.nextInt();
        System.out.println("Enter "+studentName+" Chemistry Marks : ");
        int chemistry=sc.nextInt();
        System.out.println("Enter "+studentName+" English Marks : ");
        int english=sc.nextInt();
        System.out.println("Enter "+studentName+" Automobile Marks : ");
        int automobile=sc.nextInt();
        int totalMarks=mathematics+physics+chemistry+english+automobile;
        double percentage = ((double) totalMarks / 500) * 100;
        System.out.println("Student Name : "+ studentName);
        System.out.println("----- CBSC XII Class Result -----");
        System.out.println("Mathematics           "+mathematics);
        System.out.println("Physics               "+physics);
        System.out.println("Chemistry             "+chemistry);
        System.out.println("English               "+english);
        System.out.println("Automobile            "+automobile);
        System.out.println("Total marks           "+totalMarks);
        System.out.println("           Percentage : "+percentage);
    }
}
