/*
compute and output a finite sum
it is done in a for loop style structure
and should be executed in one line
 */


public class FiniteSum {

    public static void main(String[] args) {

        // Take argument and use it for the increment limit
        int N = Integer.parseInt(args[0]);


        // For loop to declare and increment a variable
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.print(sum + ", ");
        }

    }

}
