public class Main {
  private static Calculator calculator;

  public static void main(String[] args) {
    calculator=new Calculator();
    int result=0;
    String resultStr="";

    if (args.length > 0) {
      switch (args[0]) {
        case "add":
          result=calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
          System.out.println(result);
          break;
        case "subtract":
          result=calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
          System.out.println(result);
          break;
        case "multiply":
          result=calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
          System.out.println(result);
          break;
        case "divide":
          result=calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
          System.out.println(result);
          break;
        case "fibonacciNumberFinder":
          result=calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
          System.out.println(result);
          break;
        case "intToBinaryNumber":
          resultStr=calculator.intToBinaryNumber(Integer.parseInt(args[1]));
          System.out.println(resultStr);
          break;
        case "createUniqueID":
          resultStr=calculator.createUniqueID(args[1]);
          System.out.println(resultStr);
          break;
      }
    }
  }
}
