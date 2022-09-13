public class Calculator
{

    double number;
    double number2;
    public double add(double num, double num2){

        number = num;
        number2 = num2;
        double add =  num + num2;
        return add;

    }

    public double subtract(double num, double num2){

        number = num;
        number2 = num2;
        double subtract = num - num2;
        return subtract;

    }

    public double multiply( double num, double num2){

        number = num;
        number2 = num2;

        double multiply = num * num2;
        return multiply;

    }
    public double divide( double num, double num2){

        number = num;
        number2 = num2;
        double divide = num2/num;
        return divide;

    }
}