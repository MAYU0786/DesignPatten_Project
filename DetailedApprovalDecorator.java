import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailedApprovalDecorator extends LoanApprovalDecorator {
    public DetailedApprovalDecorator(LoanApprover loanApprover) {
        super(loanApprover);
    }

    @Override
    public void ApproveLoan(Loan loan) {
        // Call the ApproveLoan method of the wrapped LoanApprover
        super.ApproveLoan(loan);

        // Determine the loan category based on the amount
        String loanCategory;
        if (loan.getAmount() <= 500000) {
            loanCategory = "Personal Loan";
        } else if (loan.getAmount() <= 1000000) {
            loanCategory = "Home Loan";
        } else {
            loanCategory = "Business Loan";
        }

        String approvalStatus = "Approved"; // You can modify this based on your logic
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        // Print the details of the loan approval
        System.out.println("Details:-");
        System.out.println("Loan Amount: " + loan.getAmount());
        System.out.println("Loan Category: " + loanCategory);
        System.out.println("Status: " + approvalStatus);
        System.out.println("Date: " + date);
        System.out.println("--------------------------------------------------");
    }
}
