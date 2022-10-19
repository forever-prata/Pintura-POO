package pinturaPirmaide;

public class Piramide {
	private float ab;
	private float h;
	private float al;
	
	private float areaTriangulo;
	private float areaBase;
	private float areaTotal;
	
	public Piramide(float ab, float h) {
		this.ab = ab;
		this.h = h;
		setAreaBase(ab);
		setAl(ab, h);
		setAreaTriangulo(ab, getAl());
		setAreaTotal(getAreaTriangulo(), getAreaBase());
	}
	
	public float getAb() {
		return ab;
	}
	public void setAb(float ab) {
		this.ab = ab;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getAl() {
		return al;
	}
	public void setAl(float ab, float h) {
		this.al = (float) Math.sqrt((ab*ab)+(h*h));
	}
	public float getAreaTriangulo() {
		return areaTriangulo;
	}
	public void setAreaTriangulo(float ab, float al) {
		this.areaTriangulo = ((ab*2)*al)/2;
	}
	public float getAreaBase() {
		return areaBase;
	}
	public void setAreaBase(float ab) {
		this.areaBase = (ab*2)*(ab*2);
	}
	public float getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(float areaTriangulo, float areaBase) {
		this.areaTotal = (areaTriangulo*4)+areaBase;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide [ab=");
		builder.append(ab);
		builder.append(", h=");
		builder.append(h);
		builder.append(", al=");
		builder.append(al);
		builder.append(", areaTriangulo=");
		builder.append(areaTriangulo);
		builder.append(", areaBase=");
		builder.append(areaBase);
		builder.append(", areaTotal=");
		builder.append(areaTotal);
		builder.append("]");
		return builder.toString();
	}
	
}
