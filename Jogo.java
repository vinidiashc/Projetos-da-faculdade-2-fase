import java.util.Scanner;
import java.util.Random;

public class Jogo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();


	int numUsuario;
	int numCpu;
	int soma;
	boolean resultado;

	
	System.out.print("Digite 0 para par ou 1 para impar"); 
	System.out.print("Informe um número inteiro");
	numUsuario = scanner.nextInt();
	numCpu = random.nextInt();
	
	soma = numUsuario + numCpu;
	resultado = soma;
		if (resultado %2 == 0){
		System.out.print("O par ganhou");
	}
	 else{
	System.out.print("O impar ganhou");
	}
}
}




