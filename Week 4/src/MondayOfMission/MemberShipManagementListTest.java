package MondayOfMission;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer1 = new RedCustomer("James", 10000,2);
        Customer customer2 = new RedCustomer("Tomas", 30000,2);
        Customer customer3 = new PlatinumCustomer("Edward", 10000,2);
        Customer customer4 = new PlatinumCustomer("Percy", 30000,2);
        Customer customer5 = new DiamondCustomer("Elizabet", 30000,2);

        customer1.showCustomerInfo();
        customer2.showCustomerInfo();
        customer3.showCustomerInfo();
        customer4.showCustomerInfo();
        customer5.showCustomerInfo();



    }
}
