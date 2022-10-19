package pinturaCubo;

public class CuboMain {

	public static void main(String[] args) {
		Cubo c = new Cubo(5);
		
		Tinta t = new Tinta(1, 3);
		t.setLatas(c.getAreaTotal());
		t.setPrecoTotal(t.getLatas(), t.getPreco());
		
		System.out.println(c.toString());
		System.out.println(t.toString());

	}

}
