package com.jmlengineering;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "green";

        System.out.println(Arrays.toString(colors));

        colors[2] = "purple";

        System.out.println(Arrays.toString(colors));

        String[] advColors = {
                "seafoam",
                "forestgreen",
                "lavender"
        };

        for (String color : colors) { // int i = 0; i < colors.length; i++
            if (color != null) {
                System.out.println(color);
            }
        }

        // using 'stream' : Arrays.stream(colors).forEach(System.out::println);
    }
}
