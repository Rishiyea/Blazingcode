import java.util.Scanner;
public class useCalculator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Calculator usecalc = new Calculator();
    int i = 0;

    System.out.println("What operation needed? ");
    String operation = input.nextLine();
    System.out.println("number1: ");
    double num = input.nextDouble();
    System.out.println("number2: ");
    double num1 = input.nextDouble();

    if ("add".equals(operation)){
      double add = usecalc.add(num,num1);
      System.out.println(add);
    }
    if ("multiply" .equals(operation)){
      double mul = usecalc.multiply(num,num1);
      System.out.println(mul);
    }
    if ("divide" .equals(operation)){
      double divid = usecalc.divide(num,num1);
      System.out.println(divid);
    }
    if ("subtract" .equals(operation)){
      double sub = usecalc.subtract(num,num1);
      System.out.println(sub);

    }
    while (i<1) {
      System.out.println("done");
      i++;
    }
  }
}