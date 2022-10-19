package pinturaCubo;

public class Tinta {
	private int tipo;
	private float rendimento;
	private float preco;
	private final int QTD = 18;
	
	//Cabe em uma nova classe?
	private float precoTotal;
	private int latas;
	
	public Tinta(int tipo, float rendimento) {
		this.tipo = tipo;
		setPreco(tipo);
		this.rendimento = rendimento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int tipo) {
		if (tipo == 1) {
			preco = (float)101.90;
		}else if (tipo == 2) {
			preco = (float)212.45;
		}else if (preco == 3) {
			preco = (float)345.56;
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
		this.latas = (int) (areaTotal/(QTD*rendimento)+1);
	}

	public int getQTD() {
		return QTD;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tinta [tipo=");
		builder.append(tipo);
		builder.append(", rendimento=");
		builder.append(rendimento);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", QTD=");
		builder.append(QTD);
		builder.append(", precoTotal=");
		builder.append(precoTotal);
		builder.append(", latas=");
		builder.append(latas);
		builder.append("]");
		return builder.toString();
	}
	
	
}
