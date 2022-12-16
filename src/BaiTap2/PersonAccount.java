package BaiTap2;

import java.util.Scanner;

public class PersonAccount extends Account {
    private double fee;

    public PersonAccount() {

    }

    public PersonAccount(int accountNo, String customerName, String balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public void withDraw(float balance) {

    }

    public void deposited() {

    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }

    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("moi ban nhap vao Fee");
        this.fee = Integer.parseInt(sc.nextLine());
    }

    public void hienThiThongTin()
    {
        super.hienThiThongTin();
        System.out.println("so thue la: "+ this.fee);
    }

    @Override
    public String toString() {
        return "PersonAccount{" +
                "fee=" + fee +
                ", accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
