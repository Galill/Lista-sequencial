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
/*Método que verifica se a lista está vazia e retorna true (caso esteja vazia) ou false (caso tenha algum elemento nela).*/
    public boolean vazia(){

        if(tamAtual == 0 ){
            return true;
        } else 
            return false;
    }
/*Método que verifica se a lista está cheia e retorna true (caso esteja cheia) ou false (caso tenha algum elemento nela).*/
    public boolean cheia(){

        if(tamAtual == tamMax){
            return true;
        } else
            return false;
    }
/*Método que retorna o tamanho da lista.*/
    public int tamanho(){
        return tamAtual;
    }
/*Método que verifica uma posição dada e retorna -1 caso essa posição seja inválida ou, retorna o seu elemento caso válida.*/
    public int elemento(int pos){
        int dado;

        if((pos > tamAtual) || (pos <= 0))
            return -1;
        
            dado = dados[pos -1];
            return dado;
    }
/*Método que vasculha toda a lista em busca de um elemento selecionado, ele retorna -1 caso não encontre o elemento ou retorna sua posição na lista caso o encontre.*/
    public int posicao(int dado){

        for(int i = 0; i < tamAtual; i++){
            if(dados[i] == dado){
                return (i + 1);
            }
        }
        return -1;
    }
/*Insere um elemento em uma posição, ele apenas insere quando a lista não está cheia, e quando a todas a posições anteriores a posição
  selecionada estão preenchidas, retorna -1 caso não possa ser inserido um valor ou, aumenta o tamanho da lista e retorna true quando insere o elemento na lista.*/
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
/*Remove um elemento da posição selecionada, retorna -1 caso a posição selecionada seja inválida ou, diminui o tamanho
  da lista e retorna o dado que foi removido da lista.*/
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
/*Printa todos os elementos da lista.*/
    public void printar(){
        for(int i = 0; i < tamAtual; i++){
            System.out.printf("%d ", dados[i]);
        }
    } 
}
