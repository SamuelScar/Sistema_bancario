import java.time.LocalDate;
import java.util.ArrayList;

public class Cartao {

    private String senha;
    private float limite;
    private LocalDate exp;
    public ArrayList<TransacaoRemota> transacoesRemotas;
    public Conta conta;

    public Cartao(){

        transacoesRemotas = new ArrayList<TransacaoRemota>();
        conta = new Conta();

    }

    public void validarSenha(){

    }

}
