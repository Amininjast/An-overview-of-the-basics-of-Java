package com.amininjast.datastructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("green"));
        balls.add(new Ball("black"));
        balls.add(new Ball("black"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());

    }

    //    record Ball(String color){}
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
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
