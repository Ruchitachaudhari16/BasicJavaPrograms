import java.util.Scanner;

public class EvenOddNumber
{
    public static void main(String args[])
    {
        //Java program to check weather a number is even or odd
        System.out.println("Enter a number to check weather it is even or Odd");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number+":is Even");
        }
        else
        {
            System.out.println(number+":is Odd");
        }
    }
}

