package inheritance;

public class Customer {
    protected int cutomerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // public Customer() {
    // customerGrade = "SILVER";
    // bonusRatio = 0.01;
    // System.out.println("Customer() 생성자 호출");
    // }

    public Customer(int customerId, String customerName) {
        this.cutomerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int,string) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

}
