package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerA = new Customer();
        customerA.setCutomerId(10010);
        customerA.setCustomerName("이순신");
        customerA.bonusPoint = 1000;
        System.out.println(customerA.showCustomerInfo());

        VIPCustomer customerB = new VIPCustomer();
        customerB.setCutomerId(10020);
        customerB.setCustomerName("김유신");
        customerB.bonusPoint = 10000;
        System.out.println(customerB.showCustomerInfo());
    }
}
