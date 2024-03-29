/*
 * (c) Michael Hofmann
 *     email@MichaelHofmann.net
 *
 */
package net.michaelhofmann.javastudies.misc.medium;

import net.michaelhofmann.javastudies.misc.medium.Shape.Circle;
import net.michaelhofmann.javastudies.misc.medium.Shape.Rectangle;
import net.michaelhofmann.javastudies.misc.medium.Shape.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michael
 */
public class ShapeTest {
    
    public ShapeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateEdges method, of class Shape.
     */
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
