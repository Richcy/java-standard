package numberClass;

import java.math.BigDecimal;

public class MainBigNumber {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("120000000000");
        System.out.println("Number 1 "+ number1);
        BigDecimal number2 = new BigDecimal("140000000000");
        System.out.println("Number 2 "+ number2);
        BigDecimal number3 = number1.add(number2);
        System.out.println("Add "+ number3);
        System.out.println("Multiply "+ number1.multiply(new BigDecimal(4)));
        System.out.println("Divide "+ number1.divide(new BigDecimal(4)));
        System.out.println("Subtract "+ number2.subtract(number1));

        Double doubleValue = number1.doubleValue();
        System.out.println("Double value "+ doubleValue);

    }
}
