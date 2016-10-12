package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure {

    private double radius;

    public Circle( double radius) {
        super();
        this.radius = radius;
    }

    @Override
	public void accept(FigureOperationVisitor operation) {
		operation.visitCircle(this);
	}
    
    public double getRadius(){
    	return this.radius;
    }

}