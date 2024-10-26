import java.util.Scanner;

public class tryjava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Convert the integer to a string
        String s = Integer.toString(n);

        // Check if the conversion is successful
        if (n >= -100 && n <= 100 )
        { System.out.println("Good job");}
        else {
            System.out.println("Wrong answer");
        }
    }
}

