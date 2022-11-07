package mission1;

public class MultipleCalculate {
    public NumClass multipleInt(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().intValue() * num2.getNum().intValue()));
    }
    public NumClass multipleFloat(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().floatValue() * num2.getNum().floatValue()));
    }
}
