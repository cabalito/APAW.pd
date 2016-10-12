package es.upm.miw.pd.visitor.figure;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
	public void accept(FigureOperationVisitor operation) {
		operation.visitSquare(this);
	}

    @Override
    public String toString() {
        return super.toString();
    }

	public double getSide() {
		return side;
	}
}
