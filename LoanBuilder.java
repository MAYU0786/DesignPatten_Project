public class LoanBuilder {
    private int amount;

    public LoanBuilder withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Loan build() {
        return new Loan(amount);
    }
}
