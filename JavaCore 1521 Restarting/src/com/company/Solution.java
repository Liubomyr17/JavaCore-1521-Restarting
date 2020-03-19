package com.company;

/*

1521. Level 15 Lection 12. OOP. Overload
1. In the Tree class, overload the info (Object s) method two times so that you get the three methods info (Object s), info (Number s), info (String s).
1.1. Understand the info (Object s) method. By analogy, make the functionality of new methods.
1.2. For example, for the info (Number s) method, the result could be “Tree No. 123, Number method, Short parameter“.

Requirements:
1. In the Tree class, the info (Object s) method must be implemented.
2. In the Tree class, the info (Number s) method must be implemented.
3. In the Tree class, the info (String s) method must be implemented.
4. The info (Number s) method should display a line similar to the line from the info (Object s) method, replacing only the phrase ("Object method" with "Number method").
5. The info (String s) method should display a string similar to the line from the info (Object s) method, replacing only the phrase ("Object method" with "String method").


 */

import java.math.BigDecimal;

/*
ООП. Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}



class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }
    public void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
    }
    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}

