package com.dragon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeLibrary {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String e;
            boolean p = true;
            while (p) {
                BookLibrary.helpMenu();
                System.out.println("Вернуться к исходному выбору? \"y\" - Да, \"n\" - Нет");
                e = sc.next();
                p = e.equalsIgnoreCase("y");
            }
        } catch (InputMismatchException e) {
            System.err.println("Введен не ответ. Программа закрыта!");
        }
    }
}
