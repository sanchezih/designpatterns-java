package _03_de_comportamiento.strategy02.src;

/**
 * Common interface for all strategies.
 */
public interface PayStrategy {
	boolean pay(int paymentAmount);

	void collectPaymentDetails();
}