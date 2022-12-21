package baitap1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Customer {
    private String cusId;
    private String cusName;
    private Boolean gender;
    private Date birthDay;
    private String address;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(String cusId, String cusName, Boolean gender, Date birthDay, String address, String email, String phone) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input(Scanner sc) throws Exception {
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Mã Khách Hàng");
                this.cusId = sc.nextLine();
                if (!this.cusId.startsWith("C")) {
                    throw new Exception("Bắt Buộc kí tự đầu tiên phải là: C");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Tên Khách Hàng");
                this.cusName = sc.nextLine();
                if (this.cusName.length() < 4) {
                    throw new Exception("Tên Khách Hàng Ít Nhất Là 4 Kí Tự");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Giới Tính Khách Hàng");
                this.gender = Boolean.parseBoolean(sc.nextLine());
                System.out.println(this.gender);
                if (this.gender.toString().equals("true") ||this.gender.toString().equals("false")) {
                    System.out.println(this.gender);
                    break;
                }else {
                     throw new Exception("Phải nhập giá trị là true/false");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Ngày Sinh Khách Hàng");
                this.birthDay = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
                if(2022 - this.birthDay.getYear() + 1900 > 18 ) {
                    break;
                }else {
                    throw new Exception("Khách hàng phải từ 18 tuổi trở lên");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Dịa Chỉ Khách Hàng");
                this.address = sc.nextLine();
                if(this.address.length() >10) {
                    break;
                }else {
                    throw new Exception("Địa chỉ khách hàng phải trên 10 kí tự");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Email Khách Hàng");
                this.email = sc.nextLine();
                if(this.email.endsWith("@gmail.com")) {
                    break;
                }else {
                    throw new Exception("Email phải đúng định dang @gmail.com");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.println("Mời Bạn Nhập Vào Số Điện Thoại Khách Hàng");
                this.phone = sc.nextLine();
                if(this.phone.startsWith("0") && this.phone.length()>=9) {
                    break;
                }else {
                    throw new Exception("Số điẹn thoại phải bắt đầu bằng 0 và ít nhất 9 chữ số");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }


    }
}
