import java.time.LocalDate;

public class Cartao {

    private String senha;
    private float limite;
    private LocalDate exp;
    public TransacaoRemota transacoesRemotas;
    public Conta conta;

    public Cartao(){

        transacoesRemotas = new TransacaoRemota();
        conta = new Conta();

    }

    public void validarSenha(){

    }

}
