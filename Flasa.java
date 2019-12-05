package flase;

public class Flasa {

	private Nalepnica sticker;
	private double price;
	private double volume = 0.33;
	private String drinkType;

	public Flasa(Nalepnica sticker, double price, double volume, String drinkType) {
		this.sticker = sticker;
		this.price = price;
		this.volume = volume;
		drinkType = drinkType.toUpperCase();
		this.drinkType = drinkType;
	}

	public Flasa(Nalepnica sticker, double price, String drinkType) {
		super();
		this.sticker = sticker;
		this.price = price;
		this.drinkType = drinkType;
		System.out.println("Niste uneli zapreminu, postavljena je podrazumevana zapremina 0.33.");
	}

	public Nalepnica getNalepnica() {
		return sticker;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Unesite validnu cenu!");
		}
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getDrinkType() {
		return drinkType;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(sticker).append(" (").append(price).append(", ").append(volume).append(", ").toString()
				.toLowerCase().concat(drinkType + ")");
	}

}
