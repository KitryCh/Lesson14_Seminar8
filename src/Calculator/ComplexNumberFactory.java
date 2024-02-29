package Calculator;

// Фабрика комплексных чисел (Factory Method): используется для создания комплексных чисел, что позволяет
// инкапсулировать процесс создания объектов. Упрощает добавление новых способов создания объектов без изменения существующего кода.
public class ComplexNumberFactory {
    // Создание комплексного числа на основе вещественной и мнимой частей
    public static ComplexNumber createComplexNumber(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}