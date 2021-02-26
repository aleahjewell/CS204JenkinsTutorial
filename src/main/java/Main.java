import java.util.Scanner;

public class Main {
  private static Calculator calculator;

  public static void main(String[] args) {
    calculator=new Calculator();
    int result=0;
    String resultStr="";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a command:");
    String command = scanner.next();

    switch (command) {
      case "add":
        result=calculator.add(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        System.out.println(result);
        break;
      case "subtract":
        result=calculator.subtract(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        System.out.println(result);
        break;
      case "multiply":
        result=calculator.multiply(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        System.out.println(result);
        break;
      case "divide":
        result=calculator.divide(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        System.out.println(result);
        break;
      case "fibonacciNumberFinder":
        result=calculator.fibonacciNumberFinder(Integer.parseInt(scanner.next()));
        System.out.println(result);
        break;
      case "intToBinaryNumber":
        resultStr=calculator.intToBinaryNumber(Integer.parseInt(scanner.next()));
        System.out.println(resultStr);
        break;
      case "createUniqueID":
        resultStr=calculator.createUniqueID(scanner.next());
        System.out.println(resultStr);
        break;
    }
  }
}
