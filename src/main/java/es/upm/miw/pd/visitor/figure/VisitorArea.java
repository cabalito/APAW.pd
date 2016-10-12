package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends FigureOperationVisitor {

	
	@Override
	public void visitCircle(Circle circle) {
		 this.circle =  (Math.PI * circle.getRadius() * circle.getRadius());
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.triangle = triangle.getBase() * triangle.getHeight() * 0.5;
	}

	@Override
	public void visitSquare(Square square) {
		this.square = square.getSide() * square.getSide();
	}
	

}
