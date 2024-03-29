/*
 * (c) Michael Hofmann
 *     email@MichaelHofmann.net
 *
 */
package net.michaelhofmann.javastudies.misc.medium;

import net.michaelhofmann.javastudies.misc.medium.Shape.Rectangle;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michael
 */
public class ShapeTest {
    
    @Test
    public void testCalculateEdges() {
        Object obj = new Rectangle();
        printShapeTraditional(obj);    
        printShape(obj);    
    }
    
    public void printShapeTraditional(Object obj) {
        if (obj instanceof Shape shape) {
            System.out.println("%s has edges: %d".formatted(
                    shape.getClass().getSimpleName(), shape.calculateEdges()));
        } else {
            throw new IllegalArgumentException("Shape not recognized");
        }
    }  
    
    public void printShape(Object obj) {
        switch (obj) {
            case Shape shape -> System.out.println("%s has edges: %d".formatted(
                    shape.getClass().getSimpleName(), shape.calculateEdges()));
            default -> throw new IllegalArgumentException("Shape not recognized");
        }
    }  
}
