package AEP3;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Avaliacao {
	private String disciplina;
	private Aluno aluno;
	
	@OneToOne(mappedBy = "avaliacao",cascade=CascadeType.ALL)
	private Nota nota;
	
	public Avaliacao(String disciplina, Aluno aluno) {
		this.disciplina=disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}
	@JsonIgnore
	public Aluno getAluno() {
		return aluno;
	}
	@JsonIgnore
	public Nota getNota() {
		return nota;
	}
}
