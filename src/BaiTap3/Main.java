package BaiTap3;

public class Main {


    public static void main(String[] args) {
        SamSung samSung = new SamSung("chụp", "ba cam", 5, 20000, true, true);
        Sony sony = new Sony("chụp", "ba cam", 5, 20000, true, false);
        samSung.showDetails();
        System.out.println("\n");
        sony.showDetails();
    }
}
