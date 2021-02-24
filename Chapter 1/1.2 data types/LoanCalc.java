/*
Create a program to calculate
the amount of money that will
have to be repayed in installments
for a loan of Principal(P) in dollars, fixed interest rate(r) in decimals, amd time (t) in years

t and P are inputs

Based on the formula

 */

public class LoanCalc {
    public static void main(String[] args) {

        // Principal loan amount in dollars
        double P = Double.parseDouble(args[0]);

        // Years to pay of the loan
        double t = Double.parseDouble(args[1]);

        // Fixed interest rate
        double r = 0.05;

        // calculation for the payment
        double payment = Math.round(P * Math.exp(r * t));

        // Tell us what it is
        System.out.println("You need to pay " + payment + " dollars over the next " + t + " years to get this Loan squared away");
    }
}
