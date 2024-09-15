package org.example;

import static java.lang.Math.pow;

class Taylor {
    double x;
    int k;

    public Taylor(double x1, int k1) { //конструктор
        x = x1;
        k = k1;
    }

    public double MyArcsin() {
        if (x <= -1.0 || x >= 1.0) {
            throw new IllegalArgumentException("Input must be in range (-1, 1)");
        }

        double sum = x; // текущяя сумма
        double num = x; // текущий член ряда
        for (int i = 1;; i++) { // бесконечный цикл, пока мы не достигнем точности
            // новый через предыдущий
            num = num * pow(x, 2) * (2 * i - 1) * ((i - 1) * 2 + 1) / ((2 * i) * (2 * i + 1));
            if (Math.abs(num) < pow(10.0, -k)) { // проверяем точность
                break;
            }
            sum += num;
        }
        return sum;
    }
}