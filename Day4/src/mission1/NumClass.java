package mission1;

public class NumClass<T extends Number> {
    T num;

    public NumClass(T num){
        this.num = num;
    }

    public T getNum(){
        return num;
    }
}
