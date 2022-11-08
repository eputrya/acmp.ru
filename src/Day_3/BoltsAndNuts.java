package Day_3;

import java.io.*;
import java.util.*;

/*
Вновь созданная фирма купила заброшенные склады на окраине города. Новому заведующему складами поручили произвести
учёт в короткие сроки. Всё шло хорошо, пока случайно не рассыпали контейнеры с болтами и гайками на каждом складе,
после чего собрали их в общие (для болтов и гаек) контейнеры, потеряв при этом несколько деталей.

Помогите оценить нанесённый ущерб на каждом складе, приняв во внимание, что, помимо потерянных деталей, болт
(или гайка) считается непригодным, если он не имеет соответствующей гайки (или болта).

Входные данные
Во входном файле INPUT.TXT описано текущее положение на складе. В первой строке через пробел записаны три целых
числа: k1, l1, m1 – начальное число болтов (100 ≤ k1 ≤ 30000, k1 кратно 100), процент потерянных деталей
(0 ≤ l1 ≤ 100) и стоимость одного болта (1 ≤ m1 ≤ 100) соответственно. Во второй строке через пробел записаны также
три целых числа: k2, l2, m2 – начальное число гаек (100 ≤ k2 ≤ 30000, k2 кратно 100), процент потерянных деталей
(0 ≤ l2 ≤ 100) и стоимость одной гайки (1 ≤ m2 ≤ 100) соответственно.

Выходные данные
В выходной OUTPUT.TXT выведите одно целое число – размер ущерба.

INPUT.TXT	       OUTPUT.TXT
1000 10 100         37000
1200 20 90

5000 15 23          53600
4000 17 22

https://acmp.ru/?main=task&id_task=294
 */

public class BoltsAndNuts {
    void solve(Scanner in, PrintWriter out) {
        int totalBolts = in.nextInt();
        int boltLoss = in.nextInt();
        int boltCost = in.nextInt();

        int totalNuts = in.nextInt();
        int nutLoss = in.nextInt();
        int nutCost = in.nextInt();

        int min = Math.min(totalBolts - (totalBolts * boltLoss) / 100, totalNuts - (totalNuts * nutLoss) / 100);
        int totalLoss = ((totalBolts - min) * boltCost) + ((totalNuts - min) * nutCost);
        System.out.println(totalLoss);

    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new BoltsAndNuts().run();
    }
}
