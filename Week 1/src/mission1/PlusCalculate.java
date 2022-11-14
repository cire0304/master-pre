package mission1;

public class PlusCalculate {

    public NumClass plusInt(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().intValue() + num2.getNum().intValue()));
    }
    public NumClass plusFloat(NumClass num1, NumClass num2){
        return new NumClass((num1.getNum().floatValue() + num2.getNum().floatValue()));
    }
}

