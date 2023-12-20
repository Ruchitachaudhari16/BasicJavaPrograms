import java.util.Scanner;

public class LeapYear {
    public static  void main(String[] args)
    {
        //Check the  weather year is leap or not
        System.out.println("Check weather year is leap or not");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0) && (year%100!=0) || (year%400==0))
        {
            System.out.println(year+":Leap Year");
        }
        else
        {
            System.out.println(year+":-Not Leap Year");

        }
        
        
    }
}
