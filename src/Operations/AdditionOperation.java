package Operations;

import Calculator.ComplexNumber;

// Операция сложения для комплексных чисел
public class AdditionOperation {
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal();
        double imaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}