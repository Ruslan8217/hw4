package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        for (int i = 0; i < 6; i++) {


            System.out.println("Введите 5 имен для списка А:");
            String name1 = scanner.next();
            String name2 = scanner.next();
            String name3 = scanner.next();
            String name4 = scanner.next();
            String name5 = scanner.next();
            ArrayList<String> listA = new ArrayList<>();
            listA.add(name1);
            listA.add(name2);
            listA.add(name3);
            listA.add(name4);
            listA.add(name5);
            System.out.println(listA);
            System.out.println("Введите следующие 5 имен для списка Б:");
            String nameB1 = scanner.next();
            String nameB2 = scanner.next();
            String nameB3 = scanner.next();
            String nameB4 = scanner.next();
            String nameB5 = scanner.next();
            ArrayList<String> listB = new ArrayList<>();
            listB.add(nameB1);
            listB.add(nameB2);
            listB.add(nameB3);
            listB.add(nameB4);
            listB.add(nameB5);
            System.out.println(listB);
            ArrayList<Boolean> listC = new ArrayList<>();
            listC.addAll(Collections.singleton(listA.addAll(listB)));
            System.out.println(listA);
            break;
        }


    }
}
