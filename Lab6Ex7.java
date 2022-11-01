import java.util.Scanner;

public class Lab6Ex7
{
    public static void main(String[] args)
    {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        while (!scan.hasNextInt()) // while non-integers are present
        {
            scan.next();
            System.out.println ("Bad input. Enter an integer.");
        }
        while (i>0) // while greater than 0
        {
            int input = scan.nextInt();
            System.out.println (i%2);
            i = (i/2);
        }

    }
}