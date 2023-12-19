import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        //Largest number among 3 number.
        //User input
        System.out.println("Enter 3 numbers to find largest One");
        Scanner sc=new Scanner(System.in);

        int numberOne= sc.nextInt();
        int numberTwo= sc.nextInt();
        int numberThree=sc.nextInt();
        if(numberOne>numberTwo && numberOne>numberThree)
        {
            System.out.println(numberOne+":is Greater");
        }
        else if (numberTwo>numberOne && numberTwo>numberThree)
        {
            System.out.println(numberTwo+":is Greater");
        }
        else
        {
            System.out.println(numberThree+":is Greater");
        }
    }
}
