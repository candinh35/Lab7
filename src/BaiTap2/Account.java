package BaiTap2;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Account {
    protected int accountNo;
    protected String customerName;
    protected float balance;

    public Account() {
    }

    public Account(int accountNo, String customerName, String balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = Float.parseFloat(balance);
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(String balance) {
        this.balance = Float.parseFloat(balance);
    }

    public void nhapThongTin(Scanner sc)
    {
        try {
            System.out.println("moi ban nhap id:");
            this.accountNo = Integer.parseInt(sc.nextLine());
            System.out.println("moi ban nhap name:");
            this.customerName =sc.nextLine();
            System.out.println("moi ban nhap balance:");
            this.balance = Float.parseFloat(sc.nextLine());
        }catch (Exception e){
            PrintStream err = System.err;
        }
       
    }


    public void hienThiThongTin()
    {
        System.out.println("ma id la: " + this.accountNo);
        System.out.println("ho va ten la: " + this.customerName);
        System.out.println("Balance la: " + this.balance);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
