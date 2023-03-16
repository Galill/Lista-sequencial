package Lista;

public interface Lista {
    
    public boolean vazia();
    public boolean cheia();
    public int tamanho();
    public int elemento(int pos);
    public int posicao(int dado);
    public boolean inserir(int pos, int dado);
    public int remover(int pos);

}
