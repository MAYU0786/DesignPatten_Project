public class President extends LoanApprover {
    @Override
    public void ApproveLoan(Loan loan) {
        System.out.println("Loan amount of " + loan.getAmount() + " approved by President");
    }
}
