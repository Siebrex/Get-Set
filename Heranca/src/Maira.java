
public class Maira extends Meninas{
		
	double salario, cachorro;
	
	
	
	public double getCachorro() {
		return cachorro;
	}


	public void setCachorro(double cachorro) {
		this.cachorro = cachorro;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}



	double getSalario() {
		return (salario + cachorro);
	}
}
