import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {

    // Cadastrar Hóspedes

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
    //System.out.println(h2);

    }

}







