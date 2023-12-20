import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        //Take the number and print the power of 2 upto N
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++)
        {
            //number = number * i;
            System.out.println(number * i);
        }
    }
    }

