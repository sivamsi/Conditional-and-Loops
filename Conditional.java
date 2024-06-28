import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=Sc.nextInt();
        if(num>=0){
            System.out.println("Number is Positive : " + num);
        }
        else {
            System.out.println("Number is Negative : " + num);
        }

    }
}
