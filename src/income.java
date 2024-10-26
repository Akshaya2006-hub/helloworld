import java.lang.System;
import java.util.Scanner;
class income {
    public static void main(String[]args)
    {Scanner income = new Scanner(System.in);
        System.out.println("enter the income");
        int a= income.nextInt();
        if(a<=8000) {
            System.out.println("YOU ARE ELIGIBLE FOR SCHOLARSHIP");
        }
        else {
            System.out.println("SORRY YOU ARE NOT ELIGIBLE");
        }


    }
}
