import java.util.Scanner;
public class LoanDriver {
    static Scanner input;
    public static void main(String[] args){
        input = new Scanner(System.in);
        System.out.println("Welcome to Centennial Banking Loan Portal");
        Loan[] loanArray = new Loan[1];
        for (int i = 0; i < loanArray.length; i++) {
            loanArray[i] = takeUserInput();
        }

        printArray(loanArray);


    }
    public static Loan takeUserInput(){
        System.out.println("---Loan Creation---");

        System.out.println("Enter loan type: ");
        System.out.println("1. COMPUTER \n2. ACCOMODATION \n3. TUITION");
        LoanType loanType = null;
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
        }

        input.nextLine();
        System.out.println("Enter your name: ");
        String borrowerName = input.nextLine();

        System.out.println("Enter loan amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter loan term in years: ");
        int termInYears = input.nextInt();

        Loan loan = new Loan(borrowerName, termInYears, amount, loanType);
        input.nextLine();
        return loan;
    }

    public static void printArray(Loan[] loans){
        //PRINT THE ARRAY
        for(Loan loan: loans){
            System.out.println("-------------------------");
            System.out.println("Name: "+loan.getBorrowerName());
            System.out.println("Loan Type: "+loan.getLoanType());
            System.out.println("Amount: "+loan.getAmount());
            System.out.println("Rate of Interest: "+loan.getRateOfInterest());
            System.out.println("Term in Years: "+loan.getTermInYears());
            System.out.println("-------------------------");
        }
    }
}
