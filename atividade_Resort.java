public class Restaurante {
private int pedido_desjejum;
private int pedido_jantar;
private int pedido_combo;
private double valor_desjejum;
private double valor_jantar;
private double valor_combo;

public Restaurante(int pedido_desjejum, int pedido_jantar, int pedido_combo,double valor_desjejum,double valor_jantar, double valor_combo){
 this.pedido_desjejum= pedido_desjejum;
 this.pedido_jantar=pedido_jantar;
 this.pedido_combo=pedido_combo;
 this.valor_desjejum= valor_desjejum;
 this.valor_jantar= valor_jantar;
 this.valor_combo=valor_combo;
}

boolean calculoContaCliente(){
    double contaCliente= pedido_desjejum * valor_desjejum + pedido_jantar* valor_jantar + valor_combo;
    return contaCliente;
}
boolean calculoCombo(){
    if(pedido_combo>0){
        valor_combo= (valor_desjejum + valor_jantar)*20\100 * pedido_combo;
        return valor_combo;
    }
}
}