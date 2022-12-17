package BaiTap7.bkap.entity;

import BaiTap7.bkap.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private boolean status;
    public  Student(){}

    public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public void inputData(Scanner sc) {
        System.out.println("Mời bạn nhập vao mã sinh viên:");
        this.studentId = sc.nextLine();

        System.out.println("Mời bạn nhap vào họ và tên sinh viên:");
        this.studentName = sc.nextLine();

        System.out.println("Mời Bạn nhập vào tuổi của sinh viên:");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.println("Mời Bạn nhập vào điểm toán của sinh viên:");
        this.diemToan = Float.parseFloat(sc.nextLine());

        System.out.println("Mời Bạn nhập vào điểm lý của sinh viên:");
        this.diemLy = Float.parseFloat(sc.nextLine());

        System.out.println("Mời Bạn nhập vào điểm Hóa của sinh viên:");
        this.diemHoa = Float.parseFloat(sc.nextLine());

        System.out.println("Mời Bạn nhập vào Trang thái của sinh viên:");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã sinh viên là :" + this.studentId);
        System.out.println("Họ và Tên sinh viên là :" + this.studentName);
        System.out.println("Tuổi sinh viên là :" + this.age);
        System.out.println("Điểm Toán sinh viên là :" + this.diemToan);
        System.out.println("Điểm Lý sinh viên là :" + this.diemLy);
        System.out.println("Điểm Hóa sinh viên là :" + this.diemHoa);
        System.out.println("Điểm Trung Bình sinh viên là :" + this.diemTB);
        System.out.println("Trang thái :" + (this.status ? "đang học": "nghỉ"));
    }

    public float diemTB()
    {
        return this.diemTB =  (this.diemHoa + this.diemToan + this.diemLy) / 3;
    }

    public void setDiem()
    {
        if (this.diemTB < MARK_PASS){
            System.out.println("sorry, Bạn đã toạch");
        }else {
            System.out.println("Chúc mừng bạn đã qua môm , Cố gắng lên");
        }
    }
}
