public abstract class LoanApprovalDecorator extends LoanApprover {
    protected LoanApprover loanApprover;

    public LoanApprovalDecorator(LoanApprover loanApprover) {
        this.loanApprover = loanApprover;
    }

    @Override
    public void ApproveLoan(Loan loan) {
        loanApprover.ApproveLoan(loan);
    }
}
