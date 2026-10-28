package javapara;
import java.util.Scanner;
public class paraonze {
	
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int num = ler.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	        ler.close();
	    }
	}
