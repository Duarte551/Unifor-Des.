// caso a main não fique como Hóspede

public class Hospede {
    private String nomeHospede;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private String endereco;
    private String telefone;


 // Constructors


    public Hospede(String nomeHospede, String cpf, String dataNascimento, int idade, String endereco, String telefone) {
        this.nomeHospede = nomeHospede;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

   // Getters and Setters

    public String getNome() {
        return nomeHospede;
    }
    public void setNome(String nome) {
        this.nomeHospede = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // para o cálculo de preço
    
    public String ehCrianca(int idade) {
        if (idade <= 13) {
            return "É criança.";
        
        } else {
            return "É adulto.";
        }
    }
    // para aparecer direito no terminal

    @Override
    public String toString() {
        return "Nome: " + nomeHospede + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: "+ idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone; 
    }

    // para exibir os dados do cadastro

   /*  public String exibirDadosHospede() {
        return "Nome: " + nomeHospede + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: "+ idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone; 
    } */

    public void exibirDadosHospede() {
        System.out.println("\n Nome: " + nomeHospede + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: "+ idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone);
    }
    
}