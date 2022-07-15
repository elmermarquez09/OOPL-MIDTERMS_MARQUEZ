package ConvertionProcess;
public class Converter {
	private String currency;
	private double amount;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Converter() {
		super();
	}
	public Converter(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
}