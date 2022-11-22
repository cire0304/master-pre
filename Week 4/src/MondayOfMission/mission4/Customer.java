package MondayOfMission.mission4;

import java.util.Comparator;
import java.util.Objects;

//public abstract class Customer implements Comparable<Customer>, Comparator<Customer> {
public abstract class Customer implements Comparable<Customer> {

    protected String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected int id;
    protected GRADE grade;


    public Customer() {
    }

    ;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(int Id, String name, GRADE grade) {
        this.name = name;
        this.id = Id;
        this.grade = grade;
    }


    public void showCustomerInfo() {
        System.out.printf("%s님의 아이디는 %d이고 등급은 %s 입니다.\n", name, id, grade);
    }


    @Override
    public int compareTo(Customer o) {
        return Integer.compare(this.getId(), o.getId());
    }

//    @Override
//    public int compare(Customer c1, Customer c2){
//        if(c1.getName().compareTo(c2.getName()) > 0) return 1;
//        else if (c1.getName().compareTo(c2.getName()) < 0) return -1;
//        else {
//            return Integer.compare(c1.getId(), c2.getId());
//        }
//    }


//    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return id == customer.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//
//
//
}