package Day_3;

import java.io.*;
import java.util.*;

/*
В отделе работают 3 сотрудника, которые получают заработную плату в рублях. Требуется определить: на сколько зарплата
самого высокооплачиваемого из них отличается от самого низкооплачиваемого.

Входные данные
В единственной строке входного файла INPUT.TXT записаны размеры зарплат всех сотрудников через пробел.
Каждая заработная плата – это натуральное число, не превышающее 105.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести одно целое число — разницу между максимальной и минимальной зарплатой.

INPUT.TXT	    OUTPUT.TXT
100 500 1000	    900
36 11 20    	    25

https://acmp.ru/?main=task&id_task=21
 */

public class Salary {
    void solve(Scanner in, PrintWriter out) {
        int firstEmlpoyee = in.nextInt();
        int secondEmlpoyee = in.nextInt();
        int thirdEmlpoyee = in.nextInt();
        int maxSalary = Math.max(Math.max(firstEmlpoyee, secondEmlpoyee), thirdEmlpoyee);
        int minSalary = Math.min(Math.min(firstEmlpoyee, secondEmlpoyee), thirdEmlpoyee);

        System.out.println(maxSalary - minSalary);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Salary().run();
    }
}
