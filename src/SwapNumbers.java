import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String args[])
    {
        //Swap 2 numbers
        int numberOne,numberTwo,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1,number2");
         numberOne=sc.nextInt();
         numberTwo=sc.nextInt();
         System.out.println("Before Swapping numbers are:"+numberOne+ " "+numberTwo);
         //Before swapping
     temp=numberOne;
     numberOne=numberTwo;
     numberTwo=temp;
     //After Swapping
     System.out.println("After Swapping numberOne:"+numberOne);
     System.out.println("After Swapping numberTwo:"+numberTwo);

    }
}
