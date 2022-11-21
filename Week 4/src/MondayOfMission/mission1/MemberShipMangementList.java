package MondayOfMission;

import java.util.ArrayList;
import java.util.List;

public class MemberShipMangementList {
    private List<Customer> customerList;
    private GradeFactory gradeFactory;
    private final String line = "======================================";

    public MemberShipMangementList() {
        customerList = new ArrayList<>();
        gradeFactory = new GradeFactory();
    }

    public void addMemberShip( int id, String name, GRADE grade){
        customerList.add(gradeFactory.createGrade(id, name, grade));
    }

    public void showAllMember() {
        System.out.println(line);
        for(Customer customer : customerList) {
            customer.showCustomerInfo();
        }
        System.out.println(line);
    }

    public int getIndexOfCustomerFromId(int id){
        for(int index =0; index < customerList.size(); index++){
            if(customerList.get(index).getId() == id) return index;
        }
        System.out.println(line);
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n",id);
        System.out.println(line);
        return -1;
    }

    public boolean removeMember(int id) {
        int index = getIndexOfCustomerFromId(id);
        if (index != -1) {
            customerList.remove(index);
            return true;
        }
        return false;
    }





}
