public class Loan {
    private String borrowerName;
    private int termInYears;
    private double amount;
    private double rateOfInterest;
    private LoanType loanType;


    public Loan(String borrowerName, int termInYears, double amount, LoanType loanType)
    {
        this.borrowerName = borrowerName;
        this.termInYears = termInYears;
        this.amount = amount;
        this.rateOfInterest = 0;
        this.loanType = loanType;
    }

    public Loan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType)
    {
        this.borrowerName = borrowerName;
        this.termInYears = termInYears;
        this.amount = amount;
        this.rateOfInterest = rateOfInterest;
        this.loanType = loanType;
    }

    public double calculateInstallments(int termInYears, double amount, double rateOfInterest){
        return (amount + ((rateOfInterest) / 100)* amount) / (termInYears * 12);
    }

    public void loanDetails(){
        System.out.println("Borrower Name: " + borrowerName + "\nTerm in Years: " + termInYears +
                "\nAmount: " + amount + "\nRate of Interest: " + rateOfInterest + "\nLoan Type: "
                + loanType + "\nMonthly Payment Installments: " + calculateInstallments(termInYears, amount, rateOfInterest));
    }

    public void printAdminFee() {System.out.println("");}

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getTermInYears() {
        return termInYears;
    }

    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }
}

