
public class Princiapl {

	public static void main(String[] args) {
		
		//instanciar objeto
		
		Maira maira = new Maira();
		Amanda amanda = new Amanda();
		
		
		maira.sapatao = "Incrivel";
		amanda.sapatao = "feia";
		maira.nota = 1000000000;
		maira.salario = 10000;
		maira.cachorro = 200;
		amanda.salario = 10000;
		amanda.cachorro = 100;
		
		System.out.println(maira.getNota());
		System.out.println(maira.getSapatao());
		System.out.println(amanda.getSapatao());
		System.out.println(maira.getSalario());
		System.out.println(amanda.getSalario());
	}

}
