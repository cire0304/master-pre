package MondayOfMission.mission3;

import java.util.HashMap;
import java.util.HashSet;

public class MemberShipMangementMap {
    private HashMap<Integer, Customer> customerList;
    private GradeFactory gradeFactory;
    private final String line = "======================================";

    public MemberShipMangementMap() {
        customerList = new HashMap<>();
        gradeFactory = new GradeFactory();
    }

    public void addMemberShip( int id, String name, GRADE grade){
        if (customerList.containsKey(id)) {
            System.out.printf("이미 있는 아아디 %d의 값이 변경됩니다.\n", id);
            customerList.remove(id);
        }
        customerList.put(id, gradeFactory.createGrade(id,name,grade));
    }

    public void showAllMember() {
        System.out.println(line);
        for(int id : customerList.keySet()) {
            Customer customer = customerList.get(id);
            customer.showCustomerInfo();
        }
        System.out.println(line);
    }

    public boolean removeMember(int id) {

        if (customerList.remove(id) == null){
            System.out.printf("%d에 해당하는 멤버가 없습니다.\n", id);
            return false;
        }
        return true;
    }





}
