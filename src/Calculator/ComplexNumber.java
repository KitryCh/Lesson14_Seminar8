package Calculator;

// Класс комплексного числа
public class ComplexNumber {
    private double real; // Вещественная часть
    private double imaginary; // Мнимая часть

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттер для вещественной части
    public double getReal() {
        return real;
    }

    // Геттер для мнимой части
    public double getImaginary() {
        return imaginary;
    }

    // Переопределение метода toString для вывода комплексного числа
    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}