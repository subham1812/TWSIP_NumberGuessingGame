import java.util.*;
public class guesser {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Guess Number Game");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range: ");
        int min=sc.nextInt();
        int max=sc.nextInt();
        int r=(int)(Math.random()*(max=min+1)+min);
        System.out.println("You have maximum 5 attempts");
        for(int i=1;i<=5;i++)
        {
            System.out.println("Guess the number: ");
            int guess=sc.nextInt();
            if(guess==r)
            {
                System.out.println("OOhhOO! Your Number is Correct. You Win the Game!");
                break;
            }
            else if(guess<r)
            {
                System.out.println("Your guess Number is Smaller");
            }
            else
            {
                System.out.println("Your Guess Number is Greater");
            }
        }
    }

}
