package baiTap5;

public class Squares extends Rectangle{

    private double side;

    public Squares(){}

    public Squares(double side) {
        this.side = side;
    }

    public Squares(double color, double filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth()
    {
        setWidth(this.side);
    }

    public void setLength()
    {
        setLength(this.side);
    }

    @Override
    public String toString() {
        return "Squares{" +
                "side=" + side +
                "} " + super.toString();
    }
}
