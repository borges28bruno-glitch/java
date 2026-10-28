package javapara;
import java.util.Scanner;
public class paracatorze {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int pares = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int num = ler.nextInt();

	            if (num % 2 == 0) {
	                pares++;
	            }
	        }

	        System.out.println("Quantidade de pares: " + pares);

	        ler.close();
	    }
	}