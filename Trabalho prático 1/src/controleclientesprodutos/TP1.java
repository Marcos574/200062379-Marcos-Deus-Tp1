package controleclientesprodutos;

import java.util.Scanner;

public class TP1 {
	
	//De começo estou definindo todas as variáveis globais do meu código.
	static int QUANTIDADECLIENTES = 0, CLIENTESCADASTRADOS = 0, posiçõesClientes, perguntarQuantidadeClientes = 0;
	static int QUANTIDADEPRODUTOS = 0, PRODUTOSCADASTRADOS = 0, perguntarQuantidadeProdutos = 0;
	static String clientes[][] = new String[300][3];
	static String produtos[][] = new String[300][5];
	static Scanner ler = new Scanner(System.in);
	
	/* Essa é a estrutura principal do código, o método main, que é usado
	para acessar os outros métodos */
	public static void main(String[] args) {
		
		
		/*Essa é a opção do pré-cadastro dos 10 clientes e 10 produtos*/
		char preCadastro;
		System.out.println("Você deseja acessar o menu com 10 clientes e 10 produtos pré-cadastrados? (S/N)");
		preCadastro = ler.next().charAt(0);
		if((preCadastro == 's') || (preCadastro == 'S')) {
			clientes[0][0] = "Richard";
			clientes[0][1] = "Rua 1";
			clientes[0][2] = "9863412";
			clientes[1][0] = "Douglas";
			clientes[1][1] = "Rua 2";
			clientes[1][2] = "98672834";
			clientes[2][0] = "Maicon";
			clientes[2][1] = "Rua 3";
			clientes[2][2] = "5363412";
			clientes[3][0] = "Ricardo";
			clientes[3][1] = "Rua 4";
			clientes[3][2] = "98817212";
			clientes[4][0] = "Marcos";
			clientes[4][1] = "Rua 5";
			clientes[4][2] = "9801902";
			clientes[5][0] = "Renato";
			clientes[5][1] = "Rua 6";
			clientes[5][2] = "8291412";
			clientes[6][0] = "Fernando";
			clientes[6][1] = "Rua 7";
			clientes[6][2] = "9009412";
			clientes[7][0] = "Lucas";
			clientes[7][1] = "Rua 8";
			clientes[7][2] = "9860023";
			clientes[8][0] = "Igor";
			clientes[8][1] = "Rua 9";
			clientes[8][2] = "9860019";
			clientes[9][0] = "Cleiton";
			clientes[9][1] = "Rua 10";
			clientes[9][2] = "6253412";
			CLIENTESCADASTRADOS = 10;
			
			produtos[0][0] = "Banana";
			produtos[0][1] = "Fruta amarela";
			produtos[0][2] = "10";
			produtos[0][3] = "20%";
			produtos[0][4] = "30";
			produtos[1][0] = "Morango";
			produtos[1][1] = "Fruta vermelha";
			produtos[1][2] = "15";
			produtos[1][3] = "10%";
			produtos[1][4] = "40";
			produtos[2][0] = "Pêra";
			produtos[2][1] = "Fruta verde claro";
			produtos[2][2] = "16";
			produtos[2][3] = "23%";
			produtos[2][4] = "15";
			produtos[3][0] = "Acerola";
			produtos[3][1] = "Fruta vermelha";
			produtos[3][2] = "8";
			produtos[3][3] = "12%";
			produtos[3][4] = "60";
			produtos[4][0] = "Arroz";
			produtos[4][1] = "Alimento branco";
			produtos[4][2] = "24";
			produtos[4][3] = "6%";
			produtos[4][4] = "45";
			produtos[5][0] = "Feijão";
			produtos[5][1] = "Alimento marrom";
			produtos[5][2] = "13";
			produtos[5][3] = "18%";
			produtos[5][4] = "78";
			produtos[6][0] = "Uva";
			produtos[6][1] = "Fruta roxa";
			produtos[6][2] = "4";
			produtos[6][3] = "28%";
			produtos[6][4] = "120";
			produtos[7][0] = "Pcanha";
			produtos[7][1] = "Carne vermelha";
			produtos[7][2] = "70";
			produtos[7][3] = "21%";
			produtos[7][4] = "16";
			produtos[8][0] = "Cebola";
			produtos[8][1] = "Alimento essencial";
			produtos[8][2] = "3";
			produtos[8][3] = "2%";
			produtos[8][4] = "120";
			produtos[9][0] = "Melnacia";
			produtos[9][1] = "Fruta grande verde";
			produtos[9][2] = "27";
			produtos[9][3] = "20%";
			produtos[9][4] = "47";
			PRODUTOSCADASTRADOS = 10;
			
		}
		
		
		/* Nesse momento estou criando o modelo do menu, com a variável "seletorMenu" sendo usada 
		para o usuário digitar a opção que ele deseja */
		int seletorMenu;
		System.out.println("\n1 - Cadastro de novo cliente");
		System.out.println("2 - Busca por cliente");
		System.out.println("3 - Cadastro de novo produto");
		System.out.println("4 - Busca por produto");
		System.out.println("5 - Cadastro de venda");
		System.out.println("6 - Mostrar produtos em estoque");
		System.out.println("7 - Sair\n");
		seletorMenu = ler.nextInt();
		
		
		/* Um sistema com "while" que só se encerra quando o usuário digitar a opção 7,
		  que seria para encerrar o menu, caso o usuário digite alguma opção entre 1 e 6,
		  o sistema irá chamar o método correspondente à opção selecionada */
		while (seletorMenu != 7) {
			switch (seletorMenu) {
				case 1:
					if (perguntarQuantidadeClientes == 0) {
						System.out.println("Obs: Digite a quantidade de clientes que serão cadastrados a partir deste momento,"
											+ " desconsidere os clientes pré cadastrados, se for o caso");
						System.out.println("Digite quantos clientes serão cadastrados: ");
						QUANTIDADECLIENTES = ler.nextInt();
						if((preCadastro == 'S') || (preCadastro == 's')) {
							QUANTIDADECLIENTES = QUANTIDADECLIENTES + 10;
						}
						perguntarQuantidadeClientes++;
					} else {
						cadastroCliente();
					}
					
					break;
				case 2:
					buscaCliente();
					
					break;
				case 3:
					if (perguntarQuantidadeProdutos == 0) {
						System.out.println("Obs: Digite a quantidade de produtos que serão cadastrados a partir deste momento,"
											+ " desconsidere os produtos pré cadastrados, se for o caso");
						System.out.println("Digite quantos produtos serão cadastrados: ");
						QUANTIDADEPRODUTOS = ler.nextInt();
						if((preCadastro == 'S') || (preCadastro == 's')) {
							QUANTIDADEPRODUTOS = QUANTIDADEPRODUTOS + 10;
						}
						perguntarQuantidadeProdutos++;
					} else {
						cadastroProduto();
					}
					break;
				case 4:
					buscaProduto();
					break;
				case 5:
					cadastroVenda();
					break;
				case 6:
					estoque();
					break;
				
				default:
					System.out.println("Digite um número válido!");
					break;
				
			}
			System.out.println("\n1 - Cadastro de novo cliente");
			System.out.println("2 - Busca por cliente");
			System.out.println("3 - Cadastro de novo produto");
			System.out.println("4 - Busca por produto");
			System.out.println("5 - Cadastro de venda");
			System.out.println("6 - Mostrar produtos em estoque");
			System.out.println("7 - Sair\n");
			seletorMenu = ler.nextInt();
		}
		
		System.out.println("Progama finalizado!");
	}
	
	
	//Método para a opção 1 do menu, cadastro de clientes
	public static void cadastroCliente() {
		
		if (CLIENTESCADASTRADOS < QUANTIDADECLIENTES) {
			System.out.println("Digite aqui o nome do "+ (CLIENTESCADASTRADOS + 1) + " cliente: ");
			clientes[CLIENTESCADASTRADOS][0] = ler.next();
			System.out.println("Digite aqui o endereço do cliente " + clientes[CLIENTESCADASTRADOS][0] + " :");
			clientes[CLIENTESCADASTRADOS][1] = ler.next();
			System.out.println("Digite aqui o telefone do cliente " + clientes[CLIENTESCADASTRADOS][0] + " :");
			clientes[CLIENTESCADASTRADOS][2] = ler.next();
			CLIENTESCADASTRADOS++;
		} else {
			System.out.println("\nQuantidade máxima de clientes cadastrados atingida!");
		}
	}
	
	
	//Método para a opção 2 do menu, busca de clientes
	public static void buscaCliente() {
		String clienteBuscado;
		char mudarCadastroCliente;
		int clienteEncontrado;
		
		System.out.println("Digite aqui o nome do cliente que deseja buscar: ");
		clienteBuscado = ler.next();
		
		clienteEncontrado = 0;
		for(int contador = 0; contador < CLIENTESCADASTRADOS; contador++) {
			if(clientes[contador][0].equals(clienteBuscado)) {
				clienteEncontrado++;
				System.out.println("\nNome: " + clientes[contador][0]);
				System.out.println("Endereço: " + clientes[contador][1]);
				System.out.println("Número: " + clientes[contador][2]);
				
				System.out.println("\nVocê deseja alterar os dados de cadastro deste cliente ? (S/N)");
				mudarCadastroCliente = ler.next().charAt(0);
				
				if((mudarCadastroCliente == 's') || (mudarCadastroCliente == 'S')) {
					clienteEncontrado++;
					System.out.println("Digite aqui o nome do "+ (contador + 1) + " cliente: ");
					clientes[contador][0] = ler.next();
					System.out.println("Digite aqui o endereço do cliente " + clientes[contador][0] + " :");
					clientes[contador][1] = ler.next();
					System.out.println("Digite aqui o telefone do cliente " + clientes[contador][0] + " :");
					clientes[contador][2] = ler.next();
				}
			}
		}
		if (clienteEncontrado == 0) {
			System.out.println("Cliente não encontrado!");
		}
	}
	
	
	//Método para a opção 3 do menu, cadastro de produto
	public static void cadastroProduto () {
		
		if (PRODUTOSCADASTRADOS < QUANTIDADEPRODUTOS) {
			System.out.println("Digite aqui o nome do "+ (PRODUTOSCADASTRADOS + 1) + " produto: ");
			produtos[PRODUTOSCADASTRADOS][0] = ler.next();
			System.out.println("Digite aqui a descrição do produto " + produtos[PRODUTOSCADASTRADOS][0] + " :");
			produtos[PRODUTOSCADASTRADOS][1] = ler.next();
			System.out.println("Digite aqui o valor de compra do produto " + produtos[PRODUTOSCADASTRADOS][0] + " :");
			produtos[PRODUTOSCADASTRADOS][2] = ler.next();
			System.out.println("Digite aqui a porcentagem de lucro do produto " + produtos[PRODUTOSCADASTRADOS][0] + " :");
			produtos[PRODUTOSCADASTRADOS][3] = ler.next();
			System.out.println("Digite aqui a quantidade em estoque do produto " + produtos[PRODUTOSCADASTRADOS][0] + " :");
			produtos[PRODUTOSCADASTRADOS][4] = ler.next();
			PRODUTOSCADASTRADOS++;
		} else {
			System.out.println("\nQuantidade máxima de produtos cadastrados atingida!");
		}
		
	}
	
	
	//Método para a opção 4 do menu, buscar produto
	public static void buscaProduto() {
		String produtoBuscado;
		char mudarCadastroProduto;
		int produtoEncontrado;
		
		System.out.println("Digite aqui o nome do produto que deseja buscar: ");
		produtoBuscado = ler.next();
		
		produtoEncontrado = 0;
		for(int contador2 = 0; contador2 < PRODUTOSCADASTRADOS; contador2++) {
			if(produtos[contador2][0].equals(produtoBuscado)) {
				produtoEncontrado++;
				System.out.println("\nNome: " + produtos[contador2][0]);
				System.out.println("Descrição: " + produtos[contador2][1]);
				System.out.println("Valor de compra: " + produtos[contador2][2]);
				System.out.println("Porcentagem de lucro: " + produtos[contador2][3]);
				System.out.println("Quantidade em estoque: " + produtos[contador2][4]);
				
				System.out.println("\nVocê deseja alterar os dados de cadastro deste produto ? (S/N)");
				mudarCadastroProduto = ler.next().charAt(0);
				
				if((mudarCadastroProduto == 's') || (mudarCadastroProduto == 'S')) {
					produtoEncontrado++;
					System.out.println("Digite aqui o nome do "+ (contador2 + 1) + " produto: ");
					produtos[contador2][0] = ler.next();
					System.out.println("Digite aqui a descrição do produto " + produtos[contador2][0] + " :");
					produtos[contador2][1] = ler.next();
					System.out.println("Digite aqui o valor de compra do produto " + produtos[contador2][0] + " :");
					produtos[contador2][2] = ler.next();
					System.out.println("Digite aqui a porcentagem de lucro do produto " + produtos[contador2][0] + " :");
					produtos[contador2][3] = ler.next();
					System.out.println("Digite aqui a quantidade em estoque do produto " + produtos[contador2][0] + " :");
					produtos[contador2][4] = ler.next();
				}
			}
		}
		if (produtoEncontrado == 0) {
			System.out.println("Produto não encontrado!");
		}
	}
	
	
	//Método para a opção 5 do menu, cadastro de venda
	public static void cadastroVenda() {
		int clienteSelecionado, produtoSelecionado = 0, quantidadeProdutoVendida;
		
		
		System.out.println("Selecione um dos clientes a seguir: ");
		for(int contador3 = 0; contador3 < CLIENTESCADASTRADOS; contador3++) {
			System.out.println(contador3 + " - " + clientes[contador3][0]);
		}
		clienteSelecionado = ler.nextInt();
		
		System.out.println("\nSelecione um dos produtos a seguir: \n");
		
		while (produtoSelecionado >= 0) {
			quantidadeProdutoVendida = 0;
			for (int contador4 = 0; contador4 < PRODUTOSCADASTRADOS; contador4++) {
				System.out.println(contador4 + " - " + produtos[contador4][0]);
			}
			System.out.println("Digite um valor negativo para finalizar o cadastro de produtos para este cliente\n");
			produtoSelecionado = ler.nextInt();
			
			if (produtoSelecionado >= 0) {
				System.out.println("Quantos produtos " + produtos[produtoSelecionado][0] +
						" o cliente " + clientes[clienteSelecionado][0] + " adquiriu? ");
				quantidadeProdutoVendida = ler.nextInt();
				int quantidadeProdutoConvertida = Integer.parseInt(produtos[produtoSelecionado][4]);
				if(quantidadeProdutoVendida > quantidadeProdutoConvertida ) {
					System.out.println("O produto selecionado não possui estoque suficiente para essa venda!");
				} else {
					int converter = quantidadeProdutoConvertida - quantidadeProdutoVendida;
					String convertido = Integer.toString(converter);
					produtos[produtoSelecionado][4] = convertido;
				}
			}
		}	
	}
	
	
	//Método para a opção 6 do menu, mostrar o estoque dos produtos
	public static void estoque() {
		for(int contador6 = 0; contador6 < PRODUTOSCADASTRADOS; contador6++) {
			System.out.println("Produto: " + produtos[contador6][0] + " - Estoque: "
		+ produtos[contador6][4] + " unidades");
		}
	}
	
	
}

