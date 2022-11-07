package mission1;

public class CalculateClass {

    String operator;

    // 실제 계산 클래스

    public CalculateClass(String str) {
        operator = str;
    }


    public NumClass calc(NumClass num1, NumClass num2) {
        if(isInt(num1) && isInt(num2)) {
            switch (operator) {
                case "+" -> {
                    PlusCalculate plusOperator = new PlusCalculate();
                    return plusOperator.plusInt(num1, num2);
                }
                case "-" -> {
                    MinusCalculate minusCalculate = new MinusCalculate();
                    return minusCalculate.minusInt(num1, num2);
                }
                case "*" -> {
                    MultipleCalculate multipleCalculate = new MultipleCalculate();
                    return multipleCalculate.multipleInt(num1, num2);
                }
                case "/" -> {
                    DivideCalculate divideCalculate = new DivideCalculate();
                    return divideCalculate.divideleInt(num1, num2);
                }
                default -> {
                    System.out.println("에러 발생");
                    return null;
                }
            }
        }

        switch (operator) {
            case "+" -> {
                PlusCalculate plusOperator = new PlusCalculate();
                return plusOperator.plusFloat(num1, num2);
            }
            case "-" -> {
                MinusCalculate minusCalculate = new MinusCalculate();
                return minusCalculate.minusFloat(num1, num2);
            }
            case "*" -> {
                MultipleCalculate multipleCalculate = new MultipleCalculate();
                return multipleCalculate.multipleFloat(num1, num2);
            }
            case "/" -> {
                DivideCalculate divideCalculate = new DivideCalculate();
                return divideCalculate.divideFloat(num1, num2);
            }
            default -> {
                System.out.println("에러 발생");
                return null;

            }
        }
    }

    public Boolean isInt(NumClass num){
        return num.getNum() instanceof Integer;
    }
    public Boolean hasPoint(String str){
        return str.contains(".");
    }
}
