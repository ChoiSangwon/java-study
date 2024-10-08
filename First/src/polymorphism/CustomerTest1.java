package polymorphism;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerA = new Customer();
        customerA.setCutomerId(10010);
        customerA.setCustomerName("이순신");
        customerA.bonusPoint = 1000;
        System.out.println(customerA.showCustomerInfo());

        System.out.println(customerA.showCustomerInfo());

        Customer customerB = new VIPCustomer(10020, "김유신", 12345);
        customerB.bonusPoint = 1000;

        System.out.println(customerB.showCustomerInfo());
        System.out.println("====== 할인율과 보너스 포인트 계산 =======");

        int price = 10000;
        int aPrice = customerA.calcPrice(price);
        int bPrice = customerB.calcPrice(price);

        System.out.println(customerA.getCustomerName() + " 님이 " + aPrice + "원 지불하셨습니다.");
        System.out.println(customerA.showCustomerInfo());
        System.out.println(customerB.getCustomerName() + " 님이 " + bPrice + "원 지불하셨습니다.");
        System.out.println(customerB.showCustomerInfo());

    }
}
