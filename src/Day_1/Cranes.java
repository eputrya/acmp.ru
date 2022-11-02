package Day_1;
import java.io.*;
import java.util.*;

/*
Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. Сколько журавликов сделал каждый
ребенок, если известно, что Петя и Сережа сделали одинаковое количество журавликов, а Катя сделала в два раза
больше журавликов, чем Петя и Сережа вместе?

Входные данные:
В единственной строке входного файла INPUT.TXT записано одно натуральное число S – общее количество сделанных
журавликов (S < 106).

Выходные данные:
В единственную строку выходного файла OUTPUT.TXT нужно вывести три числа, разделенных пробелами – количество
журавликов, которые сделал каждый ребенок (Петя, Катя и Сережа).

INPUT.TXT	 OUTPUT.TXT
6              1 4 1
24             4 16 4
60             10 40 10

https://acmp.ru/?main=task&id_task=92
 */

public class Cranes {
    void solve(Scanner in, PrintWriter out) {
        int amount = in.nextInt();
        int amountPetya = (amount / 3) / 2;
        int amountKatya = amount - amount/3;
        int amountSergey = amountPetya;

        System.out.println(amountPetya + " " + amountKatya + " " + amountSergey);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Cranes().run();
    }
}
