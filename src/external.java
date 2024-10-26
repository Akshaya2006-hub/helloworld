import java.util.Scanner;
class external{

    public static void main(String[]args)
    {
        Scanner Result=new Scanner(System.in);
        int i=Result.nextInt();
        for (int n = 1; n <= i; n++)
        {
        if(i%3==0&&i%5==0)
        {System.out.println("FizzBuzz");}
            else if(i%3==0)
            {System.out.println("Fizz");}
            else if(i%5!=0)
            {System.out.println("Buzz");
            }else
            {System.out.println(i);}
        }

    }

}

