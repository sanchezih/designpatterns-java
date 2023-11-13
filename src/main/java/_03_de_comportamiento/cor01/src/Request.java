package _03_de_comportamiento.cor01.src;

public class Request {
	private int amount;
	private boolean approved = false;

	public Request(int amount) {
		this.amount = amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getAmount() {
		return amount;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isApproved() {
		return approved;
	}
}
