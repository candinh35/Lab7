package BaiTap2;

import java.util.Scanner;

public class SavingAccount extends Account{
    private float rate;
    private int period;

    public SavingAccount() {

    }

    public SavingAccount(int accountNo, String customerName, String balance, float rate, int period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }

    public float getRate(int period)
    {
        switch (period){
            case 1:
                this.rate = 5;
                break;
            case 3:
                 this.rate = 5.5f;
            break;
            case 6:
                 this.rate = 6;
            break;
            case 12:
                 this.rate = 7;
            break;
            case 24:
                 this.rate = 7.5f;
            break;
            case 36:
                 this.rate = 8;
            break;
            default:
                 this.rate = 1.8f;
                break;
        }
        return  this.rate;
    }

    public int getPeriod()
    {
        return  this.period;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }

    public void  setPeriod(int period)
    {
        this.period = period;
    }

    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.println("moi ban nhap vao period");
        this.period = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "rate=" + rate +
                ", period=" + period +
                ", accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
