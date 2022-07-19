package com.dobreadrianalia.tema1;

public class Account {
    private int accountNo;
    private int amount;
    private long nationalId;

    public Account(){}

    public Account(int accountNo, int amount, long nationalId) {
        this.accountNo = accountNo;
        this.amount = amount;
        this.nationalId = nationalId;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getNationalId() {
        return nationalId;
    }

    public void setNationalId(long nationalId) {
        this.nationalId = nationalId;
    }

    public void deposit(int amount)
    {
        setAmount(this.amount + amount);
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if ((this.amount - amount) < 0)
            throw new NotEnoughMoneyException("The account does not have enough money!");
        setAmount(this.amount - amount);
    }

    public void linkToNationalId(long nationalId) throws InvalidNationalIdException {
        String id = String.valueOf(nationalId);
        if (id.length() != 13)
            throw new InvalidNationalIdException("The National ID must have 13 digits.");
        setNationalId(nationalId);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", nationalId='" + nationalId + '\'' +
                '}';
    }
}
