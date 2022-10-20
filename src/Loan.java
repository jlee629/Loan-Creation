public class Loan {
    private String borrowerName;
    private int termInYears;
    private double amount;
    private double rateOfInterest;
    private LoanType loanType;

    public Loan(String borrowerName, int termInYears, double amount, double rateOfInterest, LoanType loanType)
    {
        this.borrowerName = borrowerName;
        this.termInYears = termInYears;
        this.amount = amount;
        this.loanType = loanType;
        this.rateOfInterest = calculateInterestRate();
    }

    public double calculateInstallments(){
        return (amount + ((rateOfInterest) / 100)* amount) / (termInYears * 12);
    }

    public void printLoanDetails(){
        System.out.println("Borrower Name: " + borrowerName + "\nTerm in Years: " + termInYears +
                "\nAmount: " + amount + "\nRate of Interest: " + rateOfInterest + "\nLoan Type: "
                + loanType + "\nMonthly Payment Installments: "
                + calculateInstallments()+ "\nAdminFee: " + calculateAdminFee());
    }

    public double calculateInterestRate(){
        if (loanType == LoanType.COMPUTER){
            return rateOfInterest = 0;
        }
        else if (loanType == LoanType.ACCOMODATION){
            return rateOfInterest = 0.043;
        }
        else if( loanType == LoanType.TUITION){
            return rateOfInterest = 0.025;
        }
        else {
            return rateOfInterest=0;
        }
    }

    public double calculateAdminFee(){return 0;};

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

