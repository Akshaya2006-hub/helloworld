import java.util.Scanner;

class result {
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Number1:");
        int a =scan.nextInt();
        System.out.println("Number2:");
        int b=scan.nextInt();
        for (int i=a;i<=b;i=i+1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }}}