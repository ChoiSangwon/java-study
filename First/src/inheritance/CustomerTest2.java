package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerB = new VIPCustomer();
        customerB.setCutomerId(10020);
        customerB.setCustomerName("김유신");
        customerB.bonusPoint = 10000;
        System.out.println(customerB.showCustomerInfo());
    }
}
