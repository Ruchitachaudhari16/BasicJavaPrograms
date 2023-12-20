import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args)
    {
        //Compute Quotient Remainder
        //divisor=dividend*quotient+remainder.
        System.out.println("Enter Dividend and Divisor");
        Scanner sc=new Scanner(System.in);
        int dividend= sc.nextInt();
        int divisor= sc.nextInt();
        int quotient,remainder=0;
        // dividend=divisor* quotient+remainder;
        quotient=dividend/divisor;
        remainder=dividend%divisor;
        System.out.println("Quotient is:"+quotient);
        System.out.println("Remainder is:"+remainder);



    }
}
