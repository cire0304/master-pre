package mission1;

public class DivideCalculate {
    public NumClass divideleInt(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().intValue() / num2.getNum().intValue()));
    }
    public NumClass divideFloat(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().floatValue() / num2.getNum().floatValue()));
    }
}
