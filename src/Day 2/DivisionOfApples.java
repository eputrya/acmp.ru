import java.io.*;
import java.util.*;

/*
N школьников желают разделить K яблок между собой. Они рассматривают два способа дележа:

 1. разделить яблоки поровну так, чтобы каждому досталось максимальное количество яблок, при этом оставшиеся
 яблоки можно положить в корзину;
 2. разделить все яблоки так, чтобы количество яблок, доставшихся любым двум школьникам, отличалось бы не более,
 чем на 1. В этом случае могут обидеться те из них, кому достанется яблок меньше, чем другим.

Входные данные

Входной файл INPUT.TXT содержит натуральные числа N и K – количество школьников и яблок соответственно (N,K ≤ 109).
Выходные данные

В выходной файл OUTPUT.TXT выведите три целых числа через пробел:

    a. количество яблок, которые достанутся всем школьником при первом способе дележа;
    b. количество яблок, которые окажутся в корзине при первом способе дележа;
    c. количество обиженных школьников во втором случае дележа.

INPUT.TXT	OUTPUT.TXT
7 30	      4 2 5
5 15	      3 0 0

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=158
*/

public class DivisionOfApples {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int numberOfApplesAllChildren = k / n;
        int numberOfApplesInBasket = k % n;
        int numberOfferedChildren = (n - (k % n)) % n;

        System.out.println(numberOfApplesAllChildren + " " + numberOfApplesInBasket + " " + numberOfferedChildren);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new DivisionOfApples().run();
    }
}
