package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator implements NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEs(number);
	}

}
