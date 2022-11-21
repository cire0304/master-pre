package MondayOfMission.mission2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MemberShipMangementList {
    private HashSet<Customer> customerList;
    private GradeFactory gradeFactory;
    private final String line = "======================================";

    public MemberShipMangementList() {
        customerList = new HashSet<>();
        gradeFactory = new GradeFactory();
    }

    public void addMemberShip( int id, String name, GRADE grade){
        System.out.println(line);
        if(customerList.add(gradeFactory.createGrade(id, name, grade))) {
            return;
        }
        System.out.printf("이미 있는 아이디%d는 추가할 수 없습니다.",id);
        System.out.println(line);
    }

    public void showAllMember() {
        System.out.println(line);
        for(Customer customer : customerList) {
            customer.showCustomerInfo();
        }
        System.out.println(line);
    }

    public boolean removeMember(int id) {

    }





}
