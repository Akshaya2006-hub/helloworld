import java.util.Scanner;

class comparison{
    public static void main(String []args)
    {
        Scanner comparison = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary= comparison.nextInt();
        System.out.println("Enter your age");
        int age= comparison.nextInt();
        if(salary>=2000&& age>=25 )
        {System.out.println("Enter the loan amount");
        }
        else
        {System.out.println("Your are not eligible ");
        }
        int loan=comparison.nextInt();
        if(loan<=50000)
        {
            System.out.println("you are eligible");
        }
        else
        {
         System.out.println("The maximum loan amount is 50000");
        }
    }
}
