package pinturaPirmaide;

public class PiramideMain {

	public static void main(String[] args) {
		Piramide p = new Piramide((float)13.89 , (float)41.87);
		System.out.println(p.toString());
		
		Tinta t = new Tinta(2);
		t.setLatas(p.getAreaTotal());
		t.setPrecoTotal(t.getLatas(), t.getPreco());
		System.out.println(t.toString());

	}

}
