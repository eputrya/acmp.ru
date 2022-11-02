package Day_2;

import java.io.*;
import java.util.*;

/*
Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с первого километра МКАД и
едет со скоростью V километров в час. На какой отметке он остановится через T часов?

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа V и T – скорость (км/ч) и время поездки в часах
соответственно. Числа разделены пробелом. Если V>0, то Вася движется в положительном направлении по МКАД, если же
значение V<0, то в отрицательном. Ограничения: |V| ≤ 1000, 0 ≤ T ≤ 1000.

Выходные данные
В выходной файл OUTPUT.TXT выведите целое число от 1 до 109 – километр МКАД, на котором остановится Вася.

INPUT.TXT	OUTPUT.TXT
60 2	      12
-1 1	      109

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=157
 */

public class MKAD {
    void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();
        int s = v * t;
        int result = (s%109 + 109) % 109 + 1;
        System.out.println(result);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new MKAD().run();
    }
}
