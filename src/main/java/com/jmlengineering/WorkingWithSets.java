package com.jmlengineering;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("purple"));

        System.out.println(balls.size());
        balls.forEach((System.out::println));
    }

    // Using a static class
    static class Ball {
        String color;
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    // Using 'record'
    // record  Ball(String color){}
    // Output
    // 3
    // Ball[color=red]
    // Ball[color=blue]
    // Ball[color=purple]
}
