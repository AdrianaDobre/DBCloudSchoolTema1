package com.dobreadrianalia.tema1;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException {
        int i = 100;
        Account account = new Account();
        account.setAccountNo(i);
        account.deposit(100);
        System.out.println(account);
        account.withdraw(20);
        System.out.println(account);
//        account.withdraw(200); //exceptie
//        System.out.println(account);
        account.linkToNationalId(1234567891122L);
        System.out.println(account);
//        account.linkToNationalId(1837474910126664L); //exceptie
//        System.out.println(account);
//        account.linkToNationalId(1837); //exceptie
//        System.out.println(account);
        account.deposit(200);
        System.out.println(account);

        System.out.println();
        Account account2 = new Account();
        account2.setAccountNo(i+1);
        account2.deposit(300);
        System.out.println(account2);
        account2.withdraw(120);
        System.out.println(account2);
        account2.linkToNationalId(6034567891122L);
        System.out.println(account2);
    }
}
