import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =Sc.nextInt();
        System.out.println("Enter second number");
        int num2=Sc.nextInt();
        System.out.println("Enter third number");
        int num3=Sc.nextInt();
        if(num1>num2)
            if(num1>num3)
                System.out.println("The greatest is :" + num1);
        if(num2>num1)
            if(num2>num3)
                System.out.println("The greatest is :" + num2);
        if(num3>num1)
            if(num3>num2)
                System.out.println("The greatest is :" + num3);

    }
}
