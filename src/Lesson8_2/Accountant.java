package Lesson8_2;

// Класс "Бухгалтер" имплементирует интерфейс
public class Accountant implements Position {
    @Override
    public void printPosition() {
        System.out.println("Бухгалтер");
    }
}