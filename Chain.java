public class Chain {
    public static void main(String[] args) {
        LoanApprover manager = new Manager();
        LoanApprover director = new Director();
        LoanApprover president = new President();

        manager.setNextApprover(director);
        director.setNextApprover(president);

        // Building loan requests using the Builder Pattern
        Loan loan1 = new LoanBuilder().withAmount(500000).build();
        Loan loan2 = new LoanBuilder().withAmount(1000000).build();
        Loan loan3 = new LoanBuilder().withAmount(1500000).build();

        // Decorating the approvers for detailed messages
        LoanApprover decoratedManager = new DetailedApprovalDecorator(manager);
        LoanApprover decoratedDirector = new DetailedApprovalDecorator(director);
        LoanApprover decoratedPresident = new DetailedApprovalDecorator(president);

        decoratedManager.setNextApprover(decoratedDirector);
        decoratedDirector.setNextApprover(decoratedPresident);

        // Approving loans
        decoratedManager.ApproveLoan(loan1);
        decoratedManager.ApproveLoan(loan2);
        decoratedManager.ApproveLoan(loan3);
    }
}
