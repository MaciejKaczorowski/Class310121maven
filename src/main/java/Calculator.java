public class Calculator {


    public Calculator () {

    }
    public Integer add(Integer num1, Integer num2) {

        return num1 + num2;
    }
    public Integer sub(Integer num1, Integer num2) {

        return num1 - num2;
    }
    public Integer div(Integer num1, Integer num2) {
        Integer divValue = 0;
        try {
            divValue = num1/num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return num1 / num2;
    }
    public Integer mul(Integer num1, Integer num2) {

        return num1 / num2;
    }

}
