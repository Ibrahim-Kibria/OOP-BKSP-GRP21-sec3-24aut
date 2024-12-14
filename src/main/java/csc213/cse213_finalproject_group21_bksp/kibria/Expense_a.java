package csc213.cse213_finalproject_group21_bksp.kibria;

public class Expense_a {
    private String expenseName, expenseType, status;
    private int expId, amount;

    public Expense_a(String expenseName, String expenseType, String status, int id, int amount) {
        this.expenseName = expenseName;
        this.expenseType = expenseType;
        this.status = status;
        this.expId = id;
        this.amount = amount;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Expense_a{" +
                "expenseName='" + expenseName + '\'' +
                ", expenseType='" + expenseType + '\'' +
                ", status='" + status + '\'' +
                ", expId=" + expId +
                ", amount=" + amount +
                '}';
    }

    public void addExpense(int amount) {
    }


}
