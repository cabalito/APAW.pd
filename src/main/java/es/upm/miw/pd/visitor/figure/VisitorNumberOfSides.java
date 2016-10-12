package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSides extends FigureOperationVisitor {

	@Override
	public void visitCircle(Circle circle) {
		 this.circle = Double.POSITIVE_INFINITY;
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.triangle = 3;
	}

	@Override
	public void visitSquare(Square circle) {
		this.square = 4;
	}

}
