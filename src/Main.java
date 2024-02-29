//Применён принцип единственной ответственности (SOLID) - каждый класс отвечает за конкретную задачу.

import Calculator.ComplexCalculator;
import Calculator.ComplexNumber;
import Logging.CalculatorLogger;

public class Main {
    public static void main(String[] args) {
        // Создание комплексных чисел
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, -1);

        // Сложение комплексных чисел
        ComplexNumber sum = ComplexCalculator.add(num1, num2);
        CalculatorLogger.logAddition(num1, num2, sum);

        // Умножение комплексных чисел
        ComplexNumber product = ComplexCalculator.multiply(num1, num2);
        CalculatorLogger.logMultiplication(num1, num2, product);

        // Деление комплексных чисел
        ComplexNumber quotient = ComplexCalculator.divide(num1, num2);
        CalculatorLogger.logDivision(num1, num2, quotient);
    }
}