package org.example;//Использовать класс  Formatter, Scaner ( для варианта с простыми типами )
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение от -1 до 1 не включая (,):");
        Scanner cin = new Scanner(System.in);
        double x = cin.nextDouble();

        // Проверка, что x находится в пределах от -1 до 1
        if (x < -1 || x > 1) {
            System.out.println("Ошибка: значение должно быть от -1 до 1.");
            return;
        }

        System.out.println("Введите точность:");
        int k = cin.nextInt();

        Taylor arcsin = new Taylor(x, k);
        double result = arcsin.MyArcsin();

        //вывод через Formatter
        Formatter formatter = new Formatter();
        formatter.format("%." + k + "f - мой арксинус через ряд Тейлора", result);
        System.out.println(formatter.toString());

        Formatter formatter1 = new Formatter();
        formatter1.format("%." + k + "f - арксинус через стандартные функции", Math.asin(x));
        System.out.println(formatter1.toString());

        cin.close(); // Закрытие сканера
    }
}
