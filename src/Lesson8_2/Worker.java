package Lesson8_2;

// Класс "Рабочий" имплементирует интерфейс
public class Worker implements Position {
    @Override
    public void printPosition() {
        System.out.println("Рабочий");
    }
}