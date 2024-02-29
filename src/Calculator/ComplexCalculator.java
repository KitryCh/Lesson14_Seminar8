package Calculator;

import Operations.AdditionOperation;
import Operations.DivisionOperation;
import Operations.MultiplicationOperation;

// Класс калькулятора для работы с комплексными числами
public class ComplexCalculator {
    // Сложение комплексных чисел
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return AdditionOperation.add(num1, num2);
    }

    // Умножение комплексных чисел
    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        return MultiplicationOperation.multiply(num1, num2);
    }

    // Деление комплексных чисел
    public static ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        return DivisionOperation.divide(num1, num2);
    }
}