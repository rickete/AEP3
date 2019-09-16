package AEP3;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conceito {
	@Id
	private String id;
	private Aluno aluno;
	private Nota nota;
	
	@OneToOne(mappedBy="conceito", cascade=CascadeType.ALL)
	private Avaliacao avaliacao;
	
	public Conceito(Aluno aluno, Nota nota, Avaliacao avaliacao) {
		if (validaConceito()==true) {
			this.id=UUID.randomUUID().toString();
			this.aluno=aluno;
			this.nota=nota;
			this.avaliacao = avaliacao;
		}
	}
	
	private boolean validaConceito() {
		if (aluno == null || nota==null || avaliacao==null) {
			throw new RuntimeException("Não deve ser informado valores nulos");
		}else {
			return true;
		}
	}

	public String getId() {
		return id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Nota getNota() {
		return nota;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	
}
