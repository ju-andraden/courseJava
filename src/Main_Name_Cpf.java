import java.util.Scanner;

public class Main_Name_Cpf{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite seu CPF: ");
		String numero = sc.next();
		
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + numero);
			
		sc.close();
	}

}
