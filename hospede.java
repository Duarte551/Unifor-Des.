package Lunna;

public class hospede {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private String endereco;
    private String telefone;


 // Constructors


    public hospede(String nome, String cpf, String dataNascimento, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

   // Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

// não tão funcionando :(
    
    
    public String ehCrianca(int idade) {
        if (idade <= 13) {
            return "É criança.";
        
        } else {
            return "É adulto.";
        }
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: "+ idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone + "\n Você " + ehCrianca(idade); 
    }

    public String exibirDadosHospede() {
        return "Nome: " + nome + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Idade: "+ idade + "\n Endereço: " + endereco + "\n Telefone: " + telefone +" \n Você " + ehCrianca(idade); 
    }

    
}