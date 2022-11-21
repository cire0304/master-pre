package MondayOfMission.mission1;

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


}
