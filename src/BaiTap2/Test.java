package BaiTap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PersonAccount> personAccounts = new ArrayList<>();
       

        System.out.println("moi ban nhap so nhan vien");
//        int n  = Integer.parseInt(sc.nextLine());
//        for (int i = 0 ;i < n ; i++){
//            PersonAccount personAccount = new PersonAccount();
//            personAccount.nhapThongTin(sc);
//            personAccounts.add(personAccount);
//        }
//
//        for (PersonAccount person: personAccounts ) {
//            person.hienThiThongTin();
//        }

//        hien thi so lai

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.nhapThongTin(sc);
        System.out.println(savingAccount.getRate(savingAccount.getPeriod()));
    }
}
