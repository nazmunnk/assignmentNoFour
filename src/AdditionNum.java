public class AdditionNum extends MyClass {
    AdditionNum(double num1,double num2){
        super(num1,num2);

    }
    @Override
    void cal() {
     double result=num1+num2;
        System.out.println(result);
    }
}
