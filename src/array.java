//import java.util.Scanner;

class array {
    public static void main(String[] args) {
        int n = 5;  // You can change this value to increase/decrease the number of lines
        for (int i = n; i >= 1; i--) {
            // Printing spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Printing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}