//package Lunna;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

    //Cadastrar Hóspedes
  try {
    
	String nomeAtendente = "Livia";
	AtendenteResort nom = new AtendenteResort(nomeAtendente);
	System.out.println(nom.receberCliente());
    System.out.println(nom.informarServico());
		
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Digite o nome do hóspede.");
    String nome = sc.nextLine();
    System.out.println("Digite o CPF do hóspede.");
    String cpf = sc.nextLine();
    System.out.println("Digite a data de nascimento do hóspede, DD/MM/AAAA.");
    String dataNascimento = sc.nextLine();
    System.out.println("Digite o endereço do hóspede.");
    String endereco = sc.nextLine();
    System.out.println("Digite o telefone do hóspede.");
    String telefone = sc.nextLine();
    System.out.println("Obrigada :)");
    
    sc.close();

    // Pra pegar a idade

    String arrayAniversario[] = dataNascimento.split("/");
    int dia = Integer.parseInt(arrayAniversario[0]);
    int mes = Integer.parseInt(arrayAniversario[1]);
    int ano = Integer.parseInt(arrayAniversario[2]);

    LocalDate hoje = LocalDate.now();
    LocalDate aniversario = LocalDate.of(ano, mes, dia);
    int idade = Period.between(aniversario, hoje).getYears();

       //System.out.println("Nome: " + nome + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: " + idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone);


    Hospede h2 = new Hospede(nome, cpf, dataNascimento, idade, endereco, telefone);
        
        
    h2.exibirDadosHospede();
    h2.ehCrianca(idade);
    

    	FileOutputStream resultado1 = new FileOutputStream("./outputs/resultado1.txt");
    	resultado1.write("Dados do cliente: \n".getBytes());
		resultado1.write(h2.toString().getBytes());
		resultado1.close();

        		
		//Scanner servico = new Scanner(System.in);
		
		System.out.println("Escolha o que você deseja fazer no momento:");
		System.out.println("[1] - Selecionar um quarto  \n[2] - Ir até as áreas de lazer \n[3] - Ver a conta");
		int num = sc.nextInt();
		ServicoQuarto teste = new ServicoQuarto(num);
		//System.out.println(teste.exibirServico());
		int escQuarto = sc.nextInt();
		Quarto quarto = new Quarto();
		System.out.println(quarto.quartoEscolhido(escQuarto));
		System.out.println("Escolha a quantidade de dias que você deseja passar");
		int qtdias = sc.nextInt();		
		System.out.println(quarto.escolhaDias(qtdias));
		sc.close();
		
        } catch(IOException e) {
		System.out.println(e);
       }
   } 

}