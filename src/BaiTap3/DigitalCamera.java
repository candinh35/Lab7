package BaiTap3;

public abstract class DigitalCamera {
    private String make;
    private String model;
    private int megapixels;
    private float price;

    public DigitalCamera(String make, String model, int megapixels, float price) {
        this.make = make;
        this.model = model;
        this.megapixels = megapixels;
        this.price = price;
    }

    public void  showDetails()
    {
        System.out.println("Chức năng máy ảnh :" + this.make);
        System.out.println("Mẫu máy ảnh:" + this.model + "  px");
        System.out.println("Độ phân giải :" + this.megapixels);
        System.out.println("Giá Sản phẩm :" + this.price);
    }

    public abstract void capture();

}
