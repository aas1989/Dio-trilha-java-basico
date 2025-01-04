import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// TODO: complete os espaços em branco com sua solução para o problema

		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
		
			nomes[i] = sc.nextLine();
        }
        System.out.println(nomes[2]); // Terceiro nome (índice 2)
        System.out.println(nomes[6]); // Sétimo nome (índice 6)
        System.out.println(nomes[8]); // Nono nome (índice 8)

        sc.close(); // Fecha o Scanner
    }

}