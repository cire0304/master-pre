package mission1;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Calculator {

    NumClass num1;
    NumClass num2;
    String operator;
    ArrayList<String> list= new ArrayList();
    CalculateClass calculator;

    // 계산하기전, 준비 하는 클래스

    public Calculator(String str){
        str = str.replace(" ","");
        StringTokenizer tokens = new StringTokenizer(str, "+-*/", true);
        while(tokens.hasMoreTokens()){
            list.add(tokens.nextToken());
        }



        // ===================
        if (hasPoint(list.get(0)) || hasPoint(list.get(2))){
            num1 = new NumClass(Float.parseFloat(list.get(0)));
            num2 = new NumClass(Float.parseFloat(list.get(2)));
        }
        else{
            num1 = new NumClass(Integer.parseInt(list.get(0)));
            num2 = new NumClass(Integer.parseInt(list.get(2)));
        }



        calculator = new CalculateClass(list.get(1));
    }


    public NumClass calc(){
        return calculator.calc(num1,num2);
    }


    public Boolean isInt(NumClass num){
        return num.getNum() instanceof Integer;
    }
    public Boolean hasPoint(String str){
        return str.contains(".");
    }
}
