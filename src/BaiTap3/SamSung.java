package BaiTap3;

public class SamSung extends DigitalCamera{
    private boolean autoFocus;
    private  boolean panorama;

    public SamSung(String make, String model, int megapixels, float price, boolean autoFocus, boolean panorama) {
        super(make, model, megapixels, price);
        this.autoFocus = autoFocus;
        this.panorama = panorama;
    }

    @Override
    public void capture() {
        System.out.println("chup anh");
    }

    public void showDetails()
    {
        super.showDetails();
        System.out.println("tu dong lay net :"+ (this.autoFocus ? "co" : "khong"));
        System.out.println("chuo toan canh :"+ (this.panorama ? "co" : "khong"));
    }
}
