package New_Begining.Day01.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        char c = input.next().charAt(0);
        String d = input.next();
        System.out.println("Entered values are: " + a + " " + b + " " + c + " " + d);

        for(int i=0; i<d.length(); i++){
            System.out.println(d.charAt(i));
        }
        
        input.close();
    }
}
