package flase;

public class PlasticnaFlasa extends Flasa {

	private double priceWithDeposit;

	public PlasticnaFlasa(Nalepnica sticker, double price, double volume, String drinkType) {
		super(sticker, price, volume, drinkType);
		this.priceWithDeposit = price;
	}

	public PlasticnaFlasa(Nalepnica sticker, double price, String drinkType, double priceWithDeposit) {
		super(sticker, price, drinkType);
		this.priceWithDeposit = priceWithDeposit;
	}

	public double getPriceWithDeposit() {
		return priceWithDeposit;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(super.toString()).append("-").append("plastic").toString();
	}

}
