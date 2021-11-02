package com.company;

public class Main {
    public static void main(String[] args) {
        String string = "Пример строки для разбиения";
        String[] words = string.split("\\s");
        for (String subString : words) {
            System.out.println(subString);
        }
    }
}