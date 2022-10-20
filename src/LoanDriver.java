import java.util.Scanner;
public class LoanDriver {
    static Scanner input;
    static Loan[] loanArray;
    public static void main(String[] args){
        input = new Scanner(System.in);
        System.out.println("Welcome to Centennial Banking Loan Portal");

        loanArray = new Loan[3];
        for (int i = 0; i < loanArray.length; i++) {
            loanArray[i] = takeUserInput();
        }
        printAllLoans();
    }
    public static Loan takeUserInput(){
        while(true){
            System.out.println("---Loan Creation---");

            System.out.println("Enter loan type: ");
            System.out.println("1. COMPUTER \n2. ACCOMODATION \n3. TUITION");
            LoanType loanType = LoanType.COMPUTER;
            int userChoice = input.nextInt();
            switch(userChoice){
                case 1:
                    loanType = LoanType.COMPUTER;
                    break;
                case 2:
                    loanType = LoanType.ACCOMODATION;
                    break;
                case 3:
                    loanType = LoanType.TUITION;
                    break;
                default:
                    loanType = LoanType.COMPUTER;
                    break;
            }
            input.nextLine();
            System.out.println("Enter your name: ");
            String borrowerName = input.nextLine();

            System.out.println("Enter loan amount: ");
            double amount = input.nextDouble();

            System.out.println("Enter loan term in years: ");
            int termInYears = input.nextInt();

            if (loanType == LoanType.COMPUTER){
                if(amount >= ComputerLoan.getMinimumAmount() &&
                        amount <= ComputerLoan.getMaximumAmount() &&
                        termInYears >= ComputerLoan.getMinimumTerm() &&
                        termInYears <= ComputerLoan.getMaximumTerm())
                {
                    Loan computerLoan = new ComputerLoan(borrowerName,
                            termInYears, amount, ComputerLoan.getFixedRate(), loanType);
                    input.nextLine();
                    return computerLoan;
                }
                else {
                    System.out.println("Invalid Option Error!");
                }
            }
            else if (loanType == LoanType.ACCOMODATION){
                if(amount >= AccomodationLoan.getMinimumAmount() &&
                        amount <= AccomodationLoan.getMaximumAmount() &&
                        termInYears >= AccomodationLoan.getMinimumTerm() &&
                        termInYears <= AccomodationLoan.getMaximumTerm())
                {
                    Loan accomodationLoan = new AccomodationLoan(borrowerName,
                            termInYears, amount, AccomodationLoan.getFixedRate(), loanType);
                    input.nextLine();
                    return accomodationLoan;
                }
                else {
                    System.out.println("Invalid Option Error!");
                }
            }
            else if (loanType == LoanType.TUITION){
                if(amount >= TuitionLoan.getMinimumAmount() &&
                        amount <= TuitionLoan.getMaximumAmount() &&
                        termInYears >= TuitionLoan.getMinimumTerm() &&
                        termInYears <= TuitionLoan.getMaximumTerm())
                {
                    Loan tuitionLoan = new TuitionLoan(borrowerName,
                            termInYears, amount, TuitionLoan.getFixedRate(), loanType);
                    input.nextLine();
                    return tuitionLoan;
                }
                else {
                    System.out.println("Invalid Option Error!");
                }
            }
        }
    }

    public static void printAllLoans(){
        //PRINT THE ARRAY
        for(Loan l: loanArray){
            System.out.println("\n-------Loan Details--------");
            l.printLoanDetails();
        }
    }
}
