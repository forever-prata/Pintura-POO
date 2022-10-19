package pinturaPirmaide;

public class Tinta {
	private int tipo;
	private float preco;
	private int latas;
	private float precoTotal;
	private final float RENDIMENTO = (float) 4.76;
	private final int QTD = 18;
	
	public Tinta(int tipo) {
		this.tipo = tipo;
		this.setPreco(tipo);
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int tipo) {
		if (tipo == 1) {
			preco = (float)127.90;
		}else if (tipo == 2) {
			preco = (float)258.98;
		}else if (preco == 3) {
			preco = (float)344.34;
		}else {
			preco = 0;
		}
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(int latas, float preco) {
		this.precoTotal = latas * preco;
	}

	public int getLatas() {
		return latas;
	}

	public void setLatas(float areaTotal) {
		this.latas = (int) (areaTotal/(QTD*RENDIMENTO)+1);
	}

	public float getRENDIMENTO() {
		return RENDIMENTO;
	}

	public int getQTD() {
		return QTD;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tinta [tipo=");
		builder.append(tipo);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", latas=");
		builder.append(latas);
		builder.append(", precoTotal=");
		builder.append(precoTotal);
		builder.append(", RENDIMENTO=");
		builder.append(RENDIMENTO);
		builder.append(", QTD=");
		builder.append(QTD);
		builder.append("]");
		return builder.toString();
	}
	
}
