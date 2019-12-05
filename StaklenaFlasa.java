package flase;

public class StaklenaFlasa extends Flasa {

	private double priceWithDeposit;

	public StaklenaFlasa(Nalepnica sticker, double price, double volume, String drinkType) {
		super(sticker, price, volume, drinkType);
		if (volume < 0.5) {
			this.priceWithDeposit = price + (price * 0.05);
		} else {
			this.priceWithDeposit = price + (price * 0.1);
		}
	}

	public StaklenaFlasa(Nalepnica sticker, double price, String drinkType) {
		super(sticker, price, drinkType);
		this.priceWithDeposit = price + (price * 0.05);
	}

	public double getPriceWithDeposit() {
		return priceWithDeposit;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(super.toString()).append("-").append("glass").toString();
	}

}
