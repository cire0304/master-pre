package MondayOfMission.mission3;

import java.util.Objects;

public abstract class Customer {

    protected String name;

    public int getId() {
        return id;
    }

    protected int id;
    protected GRADE grade;


    public Customer(){};

    public Customer(String name){
        this.name = name;
    }
    public Customer(int Id,String name, GRADE grade){
        this.name = name;
        this.id = Id;
        this.grade = grade;
    }


    public void showCustomerInfo(){
        System.out.printf("%s님의 아이디는 %d이고 등급은 %s 입니다.\n",name, id, grade);
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
