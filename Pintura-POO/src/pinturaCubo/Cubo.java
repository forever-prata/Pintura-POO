package pinturaCubo;

public class Cubo {
	private float lado;
	private float areaFace;
	private float areaTotal;
	private float volume;
	private float diagonal;
	
	public Cubo(float lado) {
		this.lado = lado;
		setAreaFace(lado);
		setAreaTotal(getAreaFace());
		setDiagonal(lado);
		setVolume(lado);
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAreaFace() {
		return areaFace;
	}

	public void setAreaFace(float lado) {
		this.areaFace = lado*lado;
	}

	public float getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(float areaFace) {
		this.areaTotal = areaFace*6;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float lado) {
		this.volume = lado*lado*lado;
	}

	public float getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(float lado) {
		this.diagonal = (float) (lado*1.73);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cubo [lado=");
		builder.append(lado);
		builder.append(", areaFace=");
		builder.append(areaFace);
		builder.append(", areaTotal=");
		builder.append(areaTotal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", diagonal=");
		builder.append(diagonal);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
