package AEP3;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Nota {
	
	private double nota;
	private Avaliacao avaliacao;
	
	public Nota (double valor) {
		nota=validaNota(valor);
	}
	
	public double getNota() {
		return nota;
	}
	
	@JsonIgnore
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	
	private double validaNota(double valor) {
		if (valor<0.00 || valor >10.00) {
			throw new RuntimeException("As notas devem estar entre 0.00 e 10.0");
		}else {
			return valor;
		}
	}
}
