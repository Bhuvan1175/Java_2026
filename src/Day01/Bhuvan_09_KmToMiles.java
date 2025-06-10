package Day01;

import java.util.Scanner;
public class Bhuvan_09_KmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Km : ");
        int km=sc.nextInt();
        double convertionFactor=0.6213;
        System.out.println(km+" kilometer is equal to "+(convertionFactor*km)+" miles");
    }
}
