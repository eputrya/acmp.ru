package Day_4;

import java.io.*;
import java.util.*;

/*
 Для того, чтобы заработать огромный капитал, новым русским необходимо иметь неординарное мышление. Конечно, при такой
 сложной работе, должны так же присутствовать какие-то особенные механизмы для отдыха и развлечений. В этих целях в
 казино был придуман специальный набор домино для новых русских. Обычные кости домино представляют собой набор из
 различных комбинаций сочетаний двух плиток, на каждой из которых отображается от 0 до 6 точек. А этот набор
 представляет собой подобные сочетания плиток, но количество точек на каждой может быть от нуля до заданного значения,
 которое зависит от интеллектуального уровня игроков. В таком наборе костей присутствуют всевозможные сочетания плиток,
 но при этом ни одна из костей не повторяется (даже такие комбинации как 2-5 и 5-2 считаются одинаковыми).

Для изготовления данного набора костей перед изготовителем встала проблема вычисления суммарного количества точек на
всех костях домино. Это связано с тем, что домино для новых русских украшается бриллиантами, которые представляют собой
точки на плитках и при изготовлении необходимо оценить стоимость.

Помогите написать программу, которая решит эту задачу.


Входные данные
Входной файл INPUT.TXT содержит одно натуральное число N – максимальное количество точек на одной плитке домино.
(N ≤ 10000)

Выходные данные
В выходной файл OUTPUT.TXT выведите количество бриллиантовых камней, которые необходимо изготовить для заданного
набора костей.

INPUT.TXT	OUTPUT.TXT
  2	          12

https://acmp.ru/?main=task&id_task=328
 */
public class DominoDots {
    void solve(Scanner in, PrintWriter out) {
        long n = in.nextInt();
        long result = (n * (n + 1) * (n + 2) / 2);
        System.out.println(result);
    }

    void run() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new DominoDots().run();
    }
}
