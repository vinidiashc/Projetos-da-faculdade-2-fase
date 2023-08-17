/* Ano.java
   Diz se o ano é ou não Bissexto. */
import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int ano;
	boolean Valido;
	boolean sair;
        
	do{
		do{
			
		System.out.print("Informe um ano: ");
		ano = scanner.nextint();
		valido = ano >= 0 
		if (!valido)
			System.err.println("Ano invalido"); 
	} while(!valido);
		if (ano % 4 ==0 && %100 != 0) {
			System.out.printf("O ano %d é bissexto\n", ano);
		}else
			System.out.printf("O ano %d não é bissexto\n'', ano);			
		}

	} // fim do método main(String[])
	} // fim da classe bissexto