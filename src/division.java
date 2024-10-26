import java.util.Scanner;

class division {
    public static void main(String[] args) {
        Scanner division = new Scanner(System.in);
        System.out.println("enter the number");
        int a = division.nextInt();

        // System.out.println("enter the number");

        if (a % 2 == 0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println("the number is odd");
        }

        }
    }
