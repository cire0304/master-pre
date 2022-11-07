import java.util.Scanner;

public class practiceScannerAndSwitch {
    public static void main(String[] args) {
        System.out.print("연산 >> ");

        Scanner sc = new Scanner(System.in);

        float operand = sc.nextFloat();
        String operation = sc.next();
        float operator = sc.nextFloat();


        float result;
        switch (operation) {
            case "+" -> {
                result = operand + operator;
                System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
            }
            case "-" -> {
                result = operand - operator;
                System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
            }
            case "*" -> {
                result = operand * operator;
                System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
            }
            case "/" -> {
                if (operator == 0){
                    System.out.print("0으로 나눌 수 없습니다.");
                    break;
                }

                result = operand / operator;
                System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
            }
            default -> System.out.println("유효하지 않은 연산자 입니다.");
        }






        if (operation.equals("+")){
            result = operand + operator;
            System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
        }
        else if (operation.equals("-")){
            result = operand - operator;
            System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
        }
        else if (operation.equals("*")){
            result = operand * operator;
            System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
        }
        else if (operation.equals("/")){
            if (operator == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else {
                result = operand / operator;
                System.out.println(operand + operation + operator + "의 계산 결과는 " + result);
            }
        }
        else{
            System.out.println("유효하지 않은 연산자 입니다.");
        }


    }
}
