package Amimal;

public class Staff extends Person
{
    private  String school;
    private  double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public Staff() {
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +'\n' +
                "Person["+ this.getName()+","+this.getAddress()+"] \n"+
                ", school='" + school + '\n' +
                ", pay=" + pay +'\n' +
                '}';
    }
}
