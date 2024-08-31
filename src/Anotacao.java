import java.time.LocalDate;


public class Anotacao {

    private String anotacao;

    private static int numeroDaConta;

    private int numConta;
    private LocalDate data;



    public Anotacao(String anotacao) {
        this.anotacao = anotacao;
        numConta = geraNumeroDaConta();
        data = geraData();
    }

    public static int geraNumeroDaConta () {

        return numeroDaConta++;
    }

    public LocalDate geraData (){

        return data = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Anotacao{" +
                "anotacao='" + anotacao + '\'' +
                ", numConta=" + numConta +
                ", data=" + data +
                '}';
    }
}

