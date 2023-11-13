package _01_de_creacion._03_factory_method.ejemplo02.src;

public abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}