package bsu.rfe.java.group8.lab6.Yury.varA4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class BouncingBall implements Runnable {
    // Максимальный радиус, который может иметь мяч
    private static final int MAX_RADIUS = 40;
    // Минимальный радиус, который может иметь мяч
    private static final int MIN_RADIUS = 3;
    // Максимальная скорость, с которой может летать мяч
    private static final int MAX_SPEED = 15;
    private Field field;
    private int radius;
    private Color color;
    // Текущие координаты мяча
    private double x;
    private double y;
    // Вертикальная и горизонтальная компонента скорости
    private int speed;
    private double speedX;
    private double speedY;

    // Конструктор класса BouncingBall
    public BouncingBall(Field field) {
// Необходимо иметь ссылку на поле, по которому прыгает мяч,
// чтобы отслеживать выход за его пределы
        // через getWidth(), getHeight()
        this.field = field;
// Радиус мяча случайного размера
        radius = new Double(Math.random() * (MAX_RADIUS -
                MIN_RADIUS)).intValue() + MIN_RADIUS;
// Абсолютное значение скорости зависит от диаметра мяча,
// чем он больше, тем медленнее
        speed = new Double(Math.round(5 * MAX_SPEED / radius)).intValue();
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
// Начальное направление скорости тоже случайно,
// угол в пределах от 0 до 2PI
        double angle = Math.random() * 2 * Math.PI;
// Вычисляются горизонтальная и вертикальная компоненты скорости
        speedX = 3 * Math.cos(angle);
        speedY = 3 * Math.sin(angle);
// Цвет мяча выбирается случайно
        color = new Color((float) Math.random(), (float) Math.random(),
                (float) Math.random());
// Начальное положение мяча случайно
        x = Math.random() * (field.getSize().getWidth() - 2 * radius) + radius;
        y = Math.random() * (field.getSize().getHeight() - 2 * radius) + radius;
// Создаѐм новый экземпляр потока, передавая аргументом
// ссылку на класс, реализующий Runnable (т.е. на себя)
        Thread thisThread = new Thread(this);
// Запускаем поток
        thisThread.start();
    }
}
