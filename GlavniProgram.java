package flase;

import java.util.ArrayList;

public class GlavniProgram {
	public static double ukupnaCena(ArrayList<Flasa> bottles) {
		double sumValue = 0;
		for (int i = 0; i < bottles.size(); i++) {
			sumValue += bottles.get(i).getPrice();
		}
		return sumValue;
	}

	public static void main(String[] args) {

		ArrayList<Flasa> bottles = new ArrayList<Flasa>();

		Nalepnica n1 = new Nalepnica("Rosa");
		Nalepnica n2 = new Nalepnica("Heineken");

		Flasa f1 = new PlasticnaFlasa(n1, 55, 0.33, "BEZALKOHOLNO");
		Flasa f2 = new StaklenaFlasa(n2, 200, 0.5, "ALKOHOLNO");
		Flasa f3 = new PlasticnaFlasa(n1, 100, 1.5, "BEZALKOHOLNO");
		Flasa f4 = new PlasticnaFlasa(n1, 70, 0.75, "BEZALKOHOLNO");

		bottles.add(f1);
		bottles.add(f2);
		bottles.add(f3);
		bottles.add(f4);

		double sumValue = 0;
		for (int i = 0; i < bottles.size(); i++) {
			sumValue += bottles.get(i).getPrice();
		}
		System.out.println(sumValue);
		System.out.println(bottles.get(1).toString());
	}

}
