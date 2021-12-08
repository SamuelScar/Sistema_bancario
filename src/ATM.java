import java.util.ArrayList;

public class ATM {

    private int limiteTransacao;
    public ArrayList<TransacaoRemota> transacoesRemotas;

    public ATM() {

        transacoesRemotas = new ArrayList<TransacaoRemota>();

    }

    public boolean verificarCartao(){

        return true;
    }

    public boolean verificaValor(){

        return true;
    }

    public void desembFundos(){

    }

    public void receberFundos(){

    }

}
