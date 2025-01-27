public class Manager extends LoanApprover {
    @Override
    public void ApproveLoan(Loan loan) {
        if (loan.getAmount() <= 500000) {
            System.out.println("Loan amount of " + loan.getAmount() + " approved by Manager");
        } else if (nextApprover != null) {
            nextApprover.ApproveLoan(loan);
        }
    }
}
