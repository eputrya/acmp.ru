import java.io.*;
import java.util.*;

/*
 Возможно, что Вы когда то играли в игру «Глухой телефон», либо слышали о ней.
 В этой игре участникам приходится передавать информацию друг другу различными способами: словесно,
 образно, бывает даже приходится писать левой рукой текст, который другой участник команды должен будет прочитать.
 Так же известно, что практически никогда передаваемая информация не доходит до конечного адресата.
 Обозначим за Fi(x) функцию, которая преобразует текст передаваемой информации x в ту, которую получит
 участник i+1 от участника i. Тогда последний n-й участник получит данные y, которые будут
 выражаться следующей формулой:

y = Fn-1(Fn-2(…F2(F1(x))))

Но Вам необходимо исключить какие-либо внешние факторы, которые могут исказить исходную информацию и Вы должны
реализовать программу «неглухой телефон», которая сможет безошибочно доставлять исходные данные, т.е.
в нашем случае функция Fi(x) = x для всех i от 1 до n-1.

INPUT.TXT  OUTPUT.TXT
5             5

https://acmp.ru/?main=task&id_task=108
 */


public class NonDeafPhone {
    void solve(Scanner in, PrintWriter out) {
        int number = in.nextInt();
        System.out.println(number);
    }

    void run() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new NonDeafPhone().run();
    }
}

