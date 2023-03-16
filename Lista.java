package Lista;

public interface Lista {
   
    /*Verifica se a lista está vazia.*/
    public boolean vazia();
    /*Verifica se a lista está cheia.*/
    public boolean cheia();
    /*Retorna o tamanho da lista.*/  
    public int tamanho();
    /*Retorna o elemento dada uma posição na lista.*/  
    public int elemento(int pos);
    /*Retorna um elemento a partir de um dado fornecido.*/     
    public int posicao(int dado);
    /*Insere elementos na lista.*/ 
    public boolean inserir(int pos, int dado);
    /*Remove elementos da lista.*/
    public int remover(int pos);

}

