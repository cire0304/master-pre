package MondayOfMission.mission4;

import java.util.HashMap;
import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    private TreeSet<Customer> customerList;
    private GradeFactory gradeFactory;
    private final String line = "======================================";

    public MemberShipManagementTreeSet() {
        customerList = new TreeSet<>();
        gradeFactory = new GradeFactory();
    }

    public void addMemberShip( int id, String name, GRADE grade){
        if(customerList.add(gradeFactory.createGrade(id, name, grade))) {
            return;
        }
        System.out.printf("이미 있는 아이디%d는 추가할 수 없습니다.\n",id);
    }

    public void showAllMember() {
        System.out.println(line);
        for(Customer customer : customerList) {
            customer.showCustomerInfo();
        }
        System.out.println(line);
    }

    public boolean removeMember(int id) {
        for (Customer customer : customerList){
            if (customer.getId() == id) {
                return customerList.remove(customer);
            }
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n", id);

        return false;
    }





}
