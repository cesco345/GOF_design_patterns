package java_fundamentals.java_basics.refactoring_5;
import java.text.NumberFormat;

import java_fundamentals.java_basics.clean_coding_3.MortgagePaymentSchedule;

public class PrintReport {
    
    public static void main(String[] args) {
    
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
    
        double mortgage = CalculateMortgage.calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
    
        for (short month = 1; month <= years * MortgagePaymentSchedule.MONTHS_IN_YEAR; month++) {
            double balance = MortgagePaymentSchedule.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    
    }

}


