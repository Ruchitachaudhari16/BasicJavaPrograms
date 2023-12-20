import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args)
    {
        int head=0;
        int tail=0;
        int count=1;
        double random=0.0;
        System.out.println("Enter the number to flip Coin");
        Scanner no=new Scanner(System.in);
        int flips=no.nextInt();
        while(count<=flips)
        {
            random=Math.random();
            System.out.println(count+ " "+random);
            if(random<0.5)
            {
                head++;
                System.out.println("heads:"+head);
            }
            else {
                tail++;
                System.out.println("Tails:"+tail);
            }
            count++;
        }
        System.out.println("Number of heads:"+head);
        System.out.println("Number of Tails:"+tail);

        double headpercent=(double)head/flips*100;
        System.out.println("Percentage of head:"+headpercent);
        double tailpercent=(double)tail/flips*100;
        System.out.println("Percentage of tell:"+tailpercent);
    }
}
