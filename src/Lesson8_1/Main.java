package Lesson8_1;//Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве
import Lesson8_1.Rectangle;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 фигур
        Figure[] figures = new Figure[]{
                new Triangle(2, 6, 5),
                new Rectangle(5, 8),
                new Circle(2),
                new Triangle(6, 8, 10),
                new Circle(3.5)
        };

        // Выводим на экран сумму периметра всех фигур в массиве
        double totalPerimeter = Arrays.stream(figures)
                .mapToDouble(Figure::calculatePerimeter)
                .sum();

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}