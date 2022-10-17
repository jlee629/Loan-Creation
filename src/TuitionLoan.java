public class TuitionLoan extends Loan{
    private static double maximumAmount;
    private static double fixedRate;
    private static int allowedTerm;
    private double adminFee;
    public TuitionLoan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType,
                       double maximumAmount, double fixedRate, int allowedTerm, double adminFee) {
        super(borrowerName, termInYears, amount, rateOfInterest, loanType);
        this.maximumAmount = maximumAmount;
        this.fixedRate = 0.025;
        this.allowedTerm = allowedTerm;
        this.adminFee = (amount * fixedRate) / 100;
    }

    public static double getMaximumAmount() {
        return maximumAmount;
    }

    public static double getFixedRate() {
        return fixedRate;
    }

    public static int getAllowedTerm() {
        return allowedTerm;
    }

    public double getAdminFee() {
        return adminFee;
    }

    public static void setMaximumAmount(double maximumAmount) {
        if (maximumAmount >= 0 && maximumAmount <= 20000){
            TuitionLoan.maximumAmount = maximumAmount;
        }
    }
    public static void setAllowedTerm(int allowedTerm) {
        if (allowedTerm >= 3 && allowedTerm <=10){
            TuitionLoan.allowedTerm = allowedTerm;
        }
    }
}
