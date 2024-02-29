// Observer - для реализации логирования операций калькулятора, отслеживает изменения состояния калькулятора и
// регистрирует логи операций. Возможно добавление или удаление новых наблюдателей без изменения существующего кода.

package Logging;

import Calculator.ComplexNumber;

// Класс для логирования действий калькулятора
public class CalculatorLogger {
    // Логирование действия сложения
    public static void logAddition(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
    }

    // Логирование действия умножения
    public static void logMultiplication(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
    }

    // Логирование действия деления
    public static void logDivision(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
    }
}