import java.util.ArrayList;

public class Cliente {

    private String nome;
    private Integer tempo;
    public ArrayList <Cartao> cartoes;
    public ArrayList <Conta> contas;

    public Cliente() {

        cartoes = new ArrayList<Cartao>();
        contas = new ArrayList<Conta>();

    }


    public void pagarConta(float valor){

    }

}
