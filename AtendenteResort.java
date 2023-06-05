public class Atendente{
   private String nome;

   public Atendente(String nome){
     this.nome= nome;
   }

   public String getNome(){
    return nome;
 }
 public void setNome(String nome){
    this.nome=nome;
 }

   public String receberCliente(){
        System.out.println("bom dia.Seja bem-vindo ao nosso resort.Em que posso ajudá-lo?");
   }
   
   public String informarServico(){
    System.out.println("Temos em nosso resort quartos comuns ou presidenciais. Para o lazer, disponibilizamos um parque aquático.")
   }
}
