public class ComputerLoan extends Loan{
    private static double minimumAmount = 0;
    private static double maximumAmount = 1000;
    private static double fixedRate;
    private static int minimumTerm = 1;
    private static int maximumTerm = 2;
    private double adminFee;
    public ComputerLoan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType) {
        super(borrowerName, termInYears, amount, rateOfInterest, loanType);
        this.fixedRate = super.calculateInterestRate();
        this.adminFee = calculateAdminFee();
    }

    public double calculateAdminFee(){
        return 0;
    }

    public static double getMinimumAmount() {
        return minimumAmount;
    }

    public static double getFixedRate() {
        return fixedRate;
    }

    public static double getMaximumAmount() {
        return maximumAmount;
    }

    public static int getMinimumTerm() {
        return minimumTerm;
    }
    public static int getMaximumTerm() {
        return maximumTerm;
    }

}
