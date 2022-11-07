package mission1;

public class MinusCalculate {
    public NumClass minusInt(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().intValue() - num2.getNum().intValue()));
    }
    public NumClass minusFloat(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().floatValue() - num2.getNum().floatValue()));
    }
}
