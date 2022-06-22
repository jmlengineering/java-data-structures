package com.jmlengineering;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("forest green");
        colors.add("lavender");

        System.out.println(colors);
        System.out.println(colors.contains("orange"));

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
