
public class UsaEstudante {

	public UsaEstudante(){
		
	}
	
	public static void main(String[] args) {
		Estudante e1;
		e1 = new Estudante();
		
		e1.nome = "Jorge Maria";
		e1.morada = "Rua do Sol";
		e1.idade = 21;
		e1.media = 10.2;
		e1.PrintEstudante();
		
		Estudante e2;
		e2 = new Estudante();
		e2.nome = "Manuela Santos";
		e2.morada = "Rua do Mar";
		e2.idade = 23;
		e2.media = 14.5;
		e2.PrintEstudante();
		
		Estudante e3;
		e3 = new Estudante("Maria Ferreira", "Rua do Vento", 22, 15.2);
		e3.PrintEstudante();
	}

}
