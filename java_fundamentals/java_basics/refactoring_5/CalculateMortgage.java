package java_fundamentals.java_basics.refactoring_5;

import java_fundamentals.java_basics.clean_coding_3.MortgagePaymentSchedule;

public class CalculateMortgage {

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {
    
        float monthlyInterest = annualInterest / MortgagePaymentSchedule.PERCENT / MortgagePaymentSchedule.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MortgagePaymentSchedule.MONTHS_IN_YEAR);
    
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }

}
