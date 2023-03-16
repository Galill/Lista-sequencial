package Lista;

public class ListaSequencial implements Lista{
    
    public int dados[];
    public int tamAtual;
    public int tamMax;

    public ListaSequencial(){
        tamMax = 10;
        tamAtual = 0;
        dados = new int[tamMax];
    }

    public boolean vazia(){

        if(tamAtual == 0 ){
            return true;
        } else 
            return false;
    }

    public boolean cheia(){

        if(tamAtual == tamMax){
            return true;
        } else
            return false;
    }

    public int tamanho(){
        return tamAtual;
    }

    public int elemento(int pos){
        int dado;

        if((pos > tamAtual) || (pos <= 0))
            return -1;
        
            dado = dados[pos -1];
            return dado;
    }

    public int posicao(int dado){

        for(int i = 0; i < tamAtual; i++){
            if(dados[i] == dado){
                return (i + 1);
            }
        }
        return -1;
    }

    public boolean inserir(int pos, int dado){

        if(cheia() || (pos > tamAtual + 1) || (pos <= 0)){
            return false;
        }

        for(int i = tamAtual; i >= pos; i--){
            dados[i] = dados[i-1];
        }

        dados[pos - 1] = dado;
        tamAtual++;
        return true;
    }

    public int remover(int pos){
        int dado;

        if((pos > tamAtual) || (pos < 1))
            return -1;
        
            dado = dados[pos - 1];
            for(int i = pos - 1; i < tamAtual - 1; i++){
                dados[i] = dados[i + 1];
            }

            tamAtual--;
            return dado;    
    }

    public void printar(){
        for(int i = 0; i < tamAtual; i++){
            System.out.printf("%d ", dados[i]);
        }
    }
    
}
