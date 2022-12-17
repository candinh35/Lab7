package BaiTap7.bkap.run;

import BaiTap7.bkap.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> class1 = new ArrayList<>();
        int choice;
        do {
            System.out.println("==============MENU=================");
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Tính điểm trung bình sinh viên");
            System.out.println("3. Xét điểm qua cho sinh viên");
            System.out.println("4. Hiển thị thông tin sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn lựa chọn");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.println("moi bạn nập vào số sinh viên");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        Student newStudent = new Student();
                        newStudent.inputData(sc);
                        class1.add(newStudent);
                    }
                    break;
                case 2:
                    for (Student student : class1) {
                        student.diemTB();
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (Student student : class1) {
                        student.setDiem();
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    for (Student student : class1) {
                        student.displayData();
                        System.out.println("\n");
                    }

                    break;
            }
        } while (choice != 5);




    }
}
