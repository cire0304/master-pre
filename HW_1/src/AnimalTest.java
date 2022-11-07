import java.util.Scanner;


import java.util.StringTokenizer;

public class AnimalTest {

    public static void main(String[] args) {


        Animal animal = new Animal();
        Dog dog =new Dog();

        animal.talk();
        animal.showTestNum();

        dog.talk();
        dog.showTestNum();

        StringTokenizer testSt = new StringTokenizer("This is Test");

        testSt.countTokens();
        testSt.nextToken();
        Integer i = 1;






    }

}
