package BaiTap4;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7.1f,"red",5);
        System.out.println("the tich hinh tron la:");
        System.out.println(cylinder.getVolumetric());

        System.out.println("\n thong tin hinh tron la:");
        System.out.println(cylinder);
    }
}
