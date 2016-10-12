package es.upm.miw.pd.visitor.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.visitor.figure.Circle;
import es.upm.miw.pd.visitor.figure.Figure;
import es.upm.miw.pd.visitor.figure.Square;
import es.upm.miw.pd.visitor.figure.Triangle;
import es.upm.miw.pd.visitor.figure.VisitorArea;
import es.upm.miw.pd.visitor.figure.VisitorNumberOfSides;


public class Visitor2Test {
    private Collection<Figure> coleccion = new ArrayList<Figure>();
    private Circle circleTest;
    private Triangle triangleTest;
    private Square squareTest;
    
    @Before
    public void ini() {
    	this.circleTest = new Circle(2);
    	this.triangleTest = new Triangle(3,4);
    	this.squareTest = new Square(3);
    	
        coleccion.add(circleTest);
        coleccion.add(triangleTest);
        coleccion.add(squareTest);
    }

    @Test
    public void testVisitorArea() {
        VisitorArea area = new VisitorArea();
        for (Figure figure : coleccion) {
            figure.accept(area);
        }
        assertEquals(Math.PI*4, area.getCircle(), 0.001);
        assertEquals(6, area.getTriangle(), 0.001);
        assertEquals(9, area.getSquare(), 0.001);
    }

    @Test
    public void testVisitorNumberOfSides() {
        VisitorNumberOfSides numberOfSides = new VisitorNumberOfSides();
		for (Figure figure : coleccion) {
            figure.accept(numberOfSides);
        }
        assertEquals(Double.POSITIVE_INFINITY, numberOfSides.getCircle(), 0.01);
        assertEquals(3, numberOfSides.getTriangle(), 0.01);
        assertEquals(4, numberOfSides.getSquare(), 0.01);
    }

}
