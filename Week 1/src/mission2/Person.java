package mission2;

public class Person {

    private String name;
    private int age;
    private int numChild;
    private String isMarried;
    private String gender;

    public Person(String name, int age,int numChild,String isMarried,String gender){
        this.name = name;
        this.age = age;
        this.numChild = numChild;
        this.isMarried = isMarried;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getNumChild(){
        return numChild;
    }
    public String IsMarried(){
        return isMarried;
    }
    public String getGender(){
        return gender;
    }

    public void showInfo(){
        System.out.print("이름은 " + getName() + "이고 나이는" + getAge() + "살 입니다. 성별은 " + getGender() + "이고 " + IsMarried() + " 입니다.");
        System.out.println("자녀는 " + getNumChild() + "명이 있습니다.");
    }




}


