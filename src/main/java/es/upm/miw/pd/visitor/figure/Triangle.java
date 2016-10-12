package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure {
    private double base;

    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
	public void accept(FigureOperationVisitor operation) {
    	operation.visitTriangle(this);
	}

    @Override
    public String toString() {
        return super.toString();
    }

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
}
