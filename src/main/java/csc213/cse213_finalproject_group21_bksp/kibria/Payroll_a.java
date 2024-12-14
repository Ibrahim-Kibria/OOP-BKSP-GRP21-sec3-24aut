package csc213.cse213_finalproject_group21_bksp.kibria;

import java.io.Serializable;

public class Payroll_a extends Expense_a implements Serializable {
    private String payeeName, status;
    private int userId, salary;

    public Payroll_a(String expenseName, String expenseType, String status, int id, int amount, String payeeName, String status1, int userId, int salary) {
        super(expenseName, expenseType, status, id, amount);
        this.payeeName = payeeName;
        this.status = status1;
        this.userId = userId;
        this.salary = salary;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return salary;
    }

    public void setAmount(int amount) {
        this.salary = amount;
    }

    @Override
    public String toString() {
        return "Payroll_a{" +
                "payeeName='" + payeeName + '\'' +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                ", amount=" + salary +
                '}';
    }
}
