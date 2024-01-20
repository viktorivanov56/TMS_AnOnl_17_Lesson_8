package Lesson8_2;

import java.util.Arrays;

// Интерфейс с методом printPosition
interface Position {
    void printPosition();
}

// Пример использования классов
public class Main2 {
    public static void main(String[] args) {
        // Создаем объекты разных классов
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        // Вызываем метод printPosition для каждого объекта
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}

