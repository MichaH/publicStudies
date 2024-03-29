/*
 * (c) Michael Hofmann
 *     email@MichaelHofmann.net
 *
 */
package net.michaelhofmann.javastudies.misc.medium;

/**
 *
 * @author michael
 */
public class Shape {

    int calculateEdges() {
        return 0;
    }

    public static class Rectangle extends Shape {
        @Override
        int calculateEdges() {
            return 4;
        }
    }

    public static class Circle extends Shape {
        @Override
        int calculateEdges() {
            return 1;
        }
    }

    public static class Triangle extends Shape {
        @Override
        int calculateEdges() {
            return 3;
        }
    }
}
