import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<Anotacao> blocoDeNotas;

    public BlocoDeNotas( ArrayList<Anotacao> blocoDeNotas) {
        this.blocoDeNotas = blocoDeNotas;
    }

    public ArrayList<Anotacao> adicionaBlocoDeNotas(String texto) throws Exception {
        if(new Anotacao(texto).equals(null)){
            throw new Exception("Não pode existir lista null");
        }
        blocoDeNotas.add(new Anotacao(texto));
        return blocoDeNotas;
    }

    public Anotacao editaAnotacao(String novaNota, int indiceEncontrar) throws  Exception{
        if(indiceEncontrar == -1){
            throw new Exception("Não pode existir indice nulo ou vazio");
        }
        for (int i = 0; i <= blocoDeNotas.size(); i++) {
            if (i == indiceEncontrar) {
                return blocoDeNotas.set(indiceEncontrar,new Anotacao(novaNota));
            }

        }Anotacao notaDeRetorno = new Anotacao("edição não realizada!");
        return notaDeRetorno;
    }

    public boolean buscaAnotacao(String recebeAnotacao, int indice) throws Exception {
        if (recebeAnotacao.trim().equals(" ") && indice == -1) {
            throw new Exception("Não existe anotação vazia");
        }
        for(int i = 0; i < blocoDeNotas.size(); i++){
            if(blocoDeNotas.size() -1 == indice){
                return true;
            }
        } return false;
    } public Anotacao listaAnotacoes (){
        for (Anotacao nota : blocoDeNotas){
            return nota;
        } Anotacao nota = new Anotacao("erro");
        return nota;
    }


}
