public class TuitionLoan extends Loan{
    private static double minimumAmount = 0;
    private static double maximumAmount = 20000;
    private static double fixedRate;
    private static int minimumTerm = 3;
    private static int maximumTerm = 10;
    private double adminFee;
    public TuitionLoan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType) {
        super(borrowerName, termInYears, amount, rateOfInterest, loanType);
        this.fixedRate = super.calculateInterestRate();
        this.adminFee = calculateAdminFee();
    }

    public double calculateAdminFee(){
        return (super.getAmount()*fixedRate) / 100;
    }

    public static double getMinimumAmount() {
        return minimumAmount;
    }

    public static double getMaximumAmount() {
        return maximumAmount;
    }

    public static double getFixedRate() {
        return fixedRate;
    }

    public static int getMinimumTerm() {
        return minimumTerm;
    }

    public static int getMaximumTerm() {
        return maximumTerm;
    }

}
