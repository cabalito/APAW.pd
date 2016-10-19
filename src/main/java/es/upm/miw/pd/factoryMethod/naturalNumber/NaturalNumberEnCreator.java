package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator implements NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEn(number);
	}

}
