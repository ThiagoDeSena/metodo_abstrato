package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			System.out.print("Individual or company (i/c)?");
			char individuo = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(individuo == 'i') {
				System.out.print("Health expenditures: ");
				double planoDeSaude = sc.nextDouble();
				
				pessoa.add(new PessoaFisica(name, rendaAnual, planoDeSaude));
			}else if(individuo == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				
				pessoa.add(new PessoaJuridica(name, rendaAnual, numberEmployee));
			}else {
				System.out.println("Por favor, digitar um caracter correspondente (i/c)!");
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		for (Pessoa p : pessoa) {
			System.out.println(p.getName()+": $ "+String.format("%.2f",p.imposto(p.getRendaAnual())));
			
			sum += p.imposto(p.getRendaAnual());
		
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+sum);
		
		sc.close();

	}

}
