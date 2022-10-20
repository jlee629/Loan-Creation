public class AccomodationLoan extends Loan{
    private final static double minimumAmount = 0;
    private final static double maximumAmount = 6000;
    private final static int minimumTerm = 1;
    private final static int maximumTerm = 4;
    private static double fixedRate;
    private double adminFee;
    public AccomodationLoan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType) {
        super(borrowerName, termInYears, amount, rateOfInterest, loanType);
        this.fixedRate = super.calculateInterestRate();
        this.adminFee = calculateAdminFee();
    }

    public double calculateAdminFee(){
        return 65;
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
