package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo primeiroNo;
    private NoDuplo ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = primeiroNo;
        primeiroNo.setNoProximo(null);
        primeiroNo.setNoPrevio(novoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }if(primeiroNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void remove(int index){


        this.tamanhoLista--;

    }


    public NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

}
