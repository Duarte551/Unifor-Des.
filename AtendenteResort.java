public class AtendenteResort{
   private String nome;

   public AtendenteResort(String nome){
     this.nome= nome;
   }

   public String getNome(){
    return nome;
 }
 public void setNome(String nome){
    this.nome=nome;
 }

   public String receberCliente(){
        return "Bom dia. Seja bem-vindo ao nosso resort. Em que posso ajudá-lo?";
   }
   
   public String informarServico(){
         return "Temos em nosso resort quartos comuns, executivos ou presidenciais. Para o lazer, disponibilizamos um parque aquático e um passeio de bugre na praia.";
   }
}
