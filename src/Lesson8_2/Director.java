package Lesson8_2;

// Класс "Директор" имплементирует интерфейс
public class Director implements Position {
    @Override
    public void printPosition() {
        System.out.println("Директор");
    }
}