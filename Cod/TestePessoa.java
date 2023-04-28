package questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePessoa {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<PessoaIMC> lista = new ArrayList<PessoaIMC>();
	
	public static void main(String[] args) {
		while (true) {
			System.out.println();
			System.out.println("======MENU======");
			System.out.println("1. Cadastra Homem");
			System.out.println("2. Cadastrar Mulher");
			System.out.println("3. Consultar IMC");
			System.out.println("4. Listar Homens");
			System.out.println("5. Listar Mulheres");
			System.out.println("6. Listar todos os IMCs dos Homens");
			System.out.println("7. Listas todos os IMCs");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				cadastrarHomem();
				break;
			case 2:
				cadastrarMulher();
				break;
			case 3:
				consultarIMC();
				break;
			case 4:
				listarHomens();
				break;
			case 5:
				listarMulheres();
				break;
			case 6:
				listarTodosIMCHomens();
				break;
			case 7:
				listarTodosIMC();
				break;
			case 0:
				System.out.println("Encerrando Programa...");
				System.exit(0);
			default:
				System.out.println("Err4r. OPCAO INVÁLIDA!");
				break;
			}

		}
	}
	
	private static void cadastrarHomem() {
		sc.nextLine();
		System.out.println("NOME: ");
		String nome = sc.next().toUpperCase();
		
		System.out.println("DATA NASCIMENTO (USE '/' PARA SEPARAR AS DATAS): ");
		String data = sc.next();
		
		System.out.println("PESO: ");
		double peso = sc.nextDouble();
		
		System.out.println("ALTURA: ");
		double altura = sc.nextDouble();
		
		Homem homem = new Homem(nome,data,peso,altura);
		lista.add(homem);
		System.out.println("HOMEM CADASTRADO!");
	}
	
	private static void cadastrarMulher() {
		sc.nextLine();
		System.out.println("NOME: ");
		String nome = sc.next().toUpperCase();
		
		System.out.println("DATA NASCIMENTO (USE '/' PARA SEPARAR AS DATAS): ");
		String data = sc.next();
		
		System.out.println("PESO: ");
		double peso = sc.nextDouble();
		
		System.out.println("ALTURA: ");
		double altura = sc.nextDouble();
		
		Mulher mulher = new Mulher(nome,data,peso,altura);
		lista.add(mulher);
		System.out.println("MULHER CADASTRADA!");
	}
	
	private static void consultarIMC() {
		System.out.println("NOME: ");
		String nome = sc.next().toUpperCase();
		
		if (lista.isEmpty()) {
			System.out.println("NÃO TEM NINGUÉM CADASTRADO!");
			return;
		}
		PessoaIMC pessoa = buscarNome(nome);
		if (pessoa == null) {
			System.out.println("PESSOA NÃO ENCONTRADA!");
			return;
		} else {
			System.out.println(pessoa.resultIMC());
		}		
	}
	
	private static PessoaIMC buscarNome(String nome) {
		for (PessoaIMC pessoa: lista) {
			if (pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}
	
	private static void listarHomens() {
		boolean contemHomem = false;		
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NINGUÉM CADASTRADO!");
			return;
		} else {
			for (PessoaIMC pessoa: lista) {
				if (pessoa instanceof Homem) {
					contemHomem = true;
					System.out.println("=========");
					System.out.println("NOME: " + pessoa.getNome());
					System.out.println("DATA NASCIMENTO: " + pessoa.getDataNascimento());
				}
				
			}
		}
		if (!contemHomem) {
			System.out.println("NÃO TEM NENHUM HOMEM CADASTRADO NA LISTA");
			return;
		}
		
	}
	
	private static void listarMulheres() {
		boolean contemMulher = false;
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NINGUÉM CADASTRADO!");
			return;
		} else {
			for (PessoaIMC pessoa: lista) {
				if (pessoa instanceof Mulher) {
					contemMulher = true;
					System.out.println("=========");
					System.out.println("NOME: " + pessoa.getNome());
					System.out.println("DATA NASCIMENTO: " + pessoa.getDataNascimento());
				}
			}
		}
		if (!contemMulher) {
			System.out.println("NÃO TEM NENHUMA MULHER CADASTRADA NA LISTA");
			return;
		}
	}
	
	private static void listarTodosIMCHomens() {
		boolean contemHomem = false;
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NINGUÉM CADASTRADO!");
			return;
		}
		for (PessoaIMC pessoa: lista) {
			if (pessoa instanceof Homem) {
				contemHomem = true;
				System.out.println("NOME: " + pessoa.getNome());
				System.out.println("IMC: "+ pessoa.resultIMC());
			}
		}
		
		if (contemHomem == false) {
			System.out.println("NÃO TEM NENHUM HOMEM CADASTRADO NA LISTA");
			return;
		}
	}
	
	private static void listarTodosIMC() {
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NINGUÉM CADASTRADO!");
			return;
		}
		for (PessoaIMC pessoa: lista) {
				System.out.println("NOME: " + pessoa.getNome());
				System.out.println("IMC: " + pessoa.resultIMC());
			}
		}
	
}
