import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=Sc.nextInt();
        System.out.println("Enter limit");
        int limit=Sc.nextInt();
        while (num<limit) {
            if(num%2==0)
             System.out.println(num);
            num++;
        }
    }
}
