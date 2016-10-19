package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
	
	private int number;

    private NaturalNumberCreator creator;

    public NaturalNumberManager(int number) {
        this.number = number;
    }

    public NaturalNumber createNaturalNumber() {
        return creator.createNaturalNumber(number);
    }

    public void setNaturalNumberCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
}
