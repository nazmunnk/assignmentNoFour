import java.util.Scanner;
public abstract class MyClass {
double num1,num2;
MyClass(double num1,double num2)
{
    this.num1=num1;
    this.num2=num2;
}
abstract void cal();

    public static void main(String[] args) {
        MyClass myValue;

        String sign;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        sign= sc.nextLine();
        switch (sign) {
            case "+":
                myValue = new AdditionNum(10,20);
                myValue.cal();
                break;
            case "-":
                myValue = new SubtractionNum(10,20);
                myValue.cal();
                break;
            case "*":
                myValue = new MultiplicationNum(10,20);
                myValue.cal();
                break;
            case "/":
                myValue = new DivisionNum(10,20);
                myValue.cal();
                break;
            default:
                System.out.println("err");}
    }
}
