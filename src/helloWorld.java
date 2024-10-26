import java.util.Scanner;
class helloWorld {
    public static String void main(String[]args) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<s.length()-k;i++)
        {
            String strng = s.substring(i, i+k);

            if(strng.compareTo(largest) > 0) {
                largest = strng;
            }
            if(strng.compareTo(smallest)<0) {
                smallest = strng;
            }
            System.out.println(smallest + "\n" + largest);
        }




