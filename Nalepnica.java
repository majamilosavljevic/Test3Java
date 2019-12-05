package flase;

public class Nalepnica {

	private String name;
	private static int idGlobal = 1;
	private int id;

	public Nalepnica(String name) {
		this.name = name;
		this.id = idGlobal;
		idGlobal++;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(name).append(":").append(id).toString().toLowerCase();
	}

}
