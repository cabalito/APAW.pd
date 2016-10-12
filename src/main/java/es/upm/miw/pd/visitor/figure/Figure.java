package es.upm.miw.pd.visitor.figure;

public interface Figure {
	
	void accept(FigureOperationVisitor operation);
}
