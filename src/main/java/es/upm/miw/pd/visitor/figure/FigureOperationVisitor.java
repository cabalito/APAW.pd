package es.upm.miw.pd.visitor.figure;

public abstract class FigureOperationVisitor {

	protected double circle;
	protected double triangle;
	protected double square;
	
	public abstract void visitCircle(Circle circle);
	public abstract void visitTriangle(Triangle triangle);
	public abstract void visitSquare(Square square);
	
	public double getCircle() {
		return circle;
	}
	public double getTriangle() {
		return triangle;
	}
	public double getSquare() {
		return square;
	}
}
