public class Director extends LoanApprover {
    @Override
    public void ApproveLoan(Loan loan) {
        if (loan.getAmount() <= 1000000) {
            System.out.println("Loan amount of " + loan.getAmount() + " approved by Director");
        } else if (nextApprover != null) {
            nextApprover.ApproveLoan(loan);
        }
    }
}
