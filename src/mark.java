import java.lang.System;
import java.util.Scanner;
class mark {
    public static void main(String[]args) {
        Scanner mark = new Scanner(System.in);
        System.out.println("enter the mark");
        int a = mark.nextInt();
        if (a >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
