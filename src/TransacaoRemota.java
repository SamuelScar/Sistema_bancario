import java.time.LocalDate;

public class TransacaoRemota {

    private LocalDate data;
    private Byte foto;
    private float valor;
    public ATM atm;
    public Cartao cartao;

    public TransacaoRemota() {

        atm = new ATM();
        cartao = new Cartao();

    }
}
