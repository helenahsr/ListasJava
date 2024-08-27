package Sala;

public class Sala {
	private int numSala;
	private int numAlunos;
	private String curso; 
	
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public int getNumAlunos() {
		return numAlunos;
	}
	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Sala(int numSala, int numAlunos, String curso) {
		super();
		this.numSala = numSala;
		this.numAlunos = numAlunos;
		this.curso = curso;
	}
	
	public Sala() {
		
	}
}
