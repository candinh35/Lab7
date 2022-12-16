package Amimal;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("dinh van can", "ninh binh","JAVA",2, 3.2);
        System.out.printf(student.toString());

        Staff staff = new Staff("nguyen van an","Ha noi","Bach Khoa", 3.3);
        System.out.printf(staff.toString());
    }
}
