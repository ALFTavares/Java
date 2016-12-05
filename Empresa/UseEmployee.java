
public class UseEmployee {

	public UseEmployee(){
	}
	
	public static void main(String[] args) {
		
		Employee Employee1;
		Employee1 = new Employee();
		
		Employee1.nome = "James Smith";
		Employee1.idade = 26;
		Employee1.designacao = "Senior Software Engineer";
		Employee1.salario = 1500;
		
		Employee1.PrintEmployee();
		
		Employee Employee2;
		Employee2 = new Employee();
		
		Employee2.nome = "Mary Anne";
		Employee2.idade = 21;
		Employee2.designacao = "Software Engineer";
		Employee2.salario = 1350;
		
		Employee2.PrintEmployee();
		
		Employee Employee3;
		Employee3 = new Employee();
		
		Employee3.nome = "Elisabeth Singer";
		Employee3.idade = 27;
		Employee3.designacao = "Java Programmer";
		Employee3.salario = 1300;
		
		Employee3.PrintEmployee();
		
		Employee Employee4;
		Employee4 = new Employee();
		
		Employee4.nome = "John Brown";
		Employee4.idade = 21;
		Employee4.designacao = "Web Designer";
		Employee4.salario = 1350;
		
		Employee4.PrintEmployee();
	}

}
