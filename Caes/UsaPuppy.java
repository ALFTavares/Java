import java.util.Scanner;
public class UsaPuppy {

	public UsaPuppy(){
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner id = new Scanner(System.in);
		String n3, n4, n5, n6;
		String r3,r4,r5,r6;
		int i5, i6;
		Puppy p1;
		p1 = new Puppy();
		System.out.println("Qual o nome do cão?");
		p1.nome = s.nextLine();
		System.out.println("E a raça?");
		p1.raca = s.nextLine();
		System.out.print("E tem Quantos anos?");
		p1.idade = id.nextInt();
		
		p1.PrintPuppy();
		p1.Ladrar();
		
		Puppy p2;
		p2 = new Puppy();
		System.out.println("Qual o nome do cão?");
		p2.nome = s.nextLine();
		System.out.println("E a raça?");
		p2.raca = s.nextLine();
		System.out.print("E tem Quantos anos?");
		p2.idade = id.nextInt();
		
		p2.PrintPuppy();
		p2.Ladrar();
		
		Puppy p3;
		System.out.println("Qual o nome do cão?");
		n3 = s.nextLine();
		System.out.println("E a raça?");
		r3= s.nextLine();
		p3 = new Puppy(n3, r3);
		
		p3.PrintPuppy();
		p3.Ladrar();
		
		Puppy p4;
		System.out.println("Qual o nome do cão?");
		n4 = s.nextLine();	
		System.out.println("E a raça?");
		r4= s.nextLine();
		p4 = new Puppy(n4, r4);
		
		p4.PrintPuppy();
		p4.Ladrar();
		
		Puppy p5;
		System.out.println("Qual o nome do cão?");
		n5 = s.nextLine();
		System.out.println("E a raça?");
		r5= s.nextLine();
		System.out.print("E tem Quantos anos?");
		i5 = id.nextInt();
		p5 = new Puppy(n5, r5, i5);
		
		p5.PrintPuppy();
		p5.Ladrar();
		
		Puppy p6;
		System.out.println("Qual o nome do cão?");
		n6 = s.nextLine();
		System.out.println("E a raça?");
		r6= s.nextLine();
		System.out.print("E tem Quantos anos?");
		i6 = id.nextInt();
		p6 = new Puppy(n6, r6, i6);
		
		p6.PrintPuppy();
		p6.Ladrar();
	}

}
