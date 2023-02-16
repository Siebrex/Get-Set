
public abstract class Meninas {
		
	String sapatao;
	double nota;

	public String getSapatao() {
		return sapatao;
	}

	public void setSapatao(String sapatao) {
		this.sapatao = sapatao;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	abstract double getSalario();//filhos implementem esse metodo. a bastract servira de molde 
	
	
}
