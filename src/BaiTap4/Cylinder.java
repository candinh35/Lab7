package BaiTap4;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric()
    {
        return Math.PI * getRadius() * getRadius() * this.height;
    }

    @Override
    public String toString() {
        return  "Circle{" +'\n' +
                "[Cylinder[height] = "+this.height+"] \n"+
                "radius=" + getRadius() +'\n' +
                ", color='" + getColor() + '\n' +
                '}';
    }
}
