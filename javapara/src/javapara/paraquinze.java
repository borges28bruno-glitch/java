package javapara;

import java.util.Scanner;

public class paraquinze {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int num = ler.nextInt();

	            soma = soma + num;
	        }

	        System.out.println("Soma: " + soma);

	        ler.close();
	    }
	}
