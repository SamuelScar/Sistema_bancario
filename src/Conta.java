import java.util.ArrayList;

public class Conta {

    private float saldo;
    private String tipo;
    public ArrayList<TransacaoRemota> transacoesRemotas;
    public Cartao cartao;
    public Cliente cliente;
    public Banco banco;

    public Conta(){

        transacoesRemotas = new ArrayList<TransacaoRemota>();
        cliente = new Cliente();
        banco = new Banco();
    }

    public void criaCartao(){
        this.cartao = new Cartao();
    }

    public boolean fecha(){

        return false;
    }

    public void verificaSaldo(){

    }

    public void credita(float valor){

    }

    public void debita(float valor){

    }

}
