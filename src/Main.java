import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList <Anotacao> blocoDeNotas = new ArrayList<>();
        BlocoDeNotas bloco1 = new BlocoDeNotas(blocoDeNotas);
        bloco1.adicionaBlocoDeNotas("Gosto de comer doce");
        bloco1.adicionaBlocoDeNotas("Eva é o nome da minha mãe");
        bloco1.adicionaBlocoDeNotas("Comemoro cada pequeno passo que dou na programação");
        bloco1.editaAnotacao("Quero de comer doce",0);
        bloco1.buscaAnotacao("Gosto de comer doce",0);

        System.out.println(bloco1.listaAnotacoes());


    }
}
