public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("substract= "+ calculator.getSubtractionResult());

        calculator.setFirstNumber(-1.25);
        calculator.setSecondNumber(-1.25);

        System.out.println("multiply= "+ calculator.getMultiplicationResult());
        System.out.println("deivide= "+ calculator.getDivisionResult());
    }
}
