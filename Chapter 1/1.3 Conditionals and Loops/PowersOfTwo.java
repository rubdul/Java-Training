// Code to write the powers of 2 ansd list them

public class PowersOfTwo {

    public static void main(String[] args) {

        int i = 0;
        int v = 1;

        while (i <= 30) {
            // write the curent power of 2
            System.out.println(i + " " + v);
            //recalculate v
            v = 2 * v;
            i++;

        }


    }
}
