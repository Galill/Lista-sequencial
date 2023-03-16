package Lista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){  
        ListaSequencial lista = new ListaSequencial();
        Scanner sc = new Scanner(System.in);
        int pos = 0, dado = 0;
        char w = 0, x = 0, y = 0, z = 0;

       while(x != 'n'){             
         System.out.println("Digite a posição do valor: ");
             pos = sc.nextInt();
         System.out.println("Digite o valor a ser inserido: ");
             dado = sc.nextInt();
         System.out.println(lista.inserir(pos, dado)); 
         System.out.println("Sua lista contém os elementos: ");
             lista.printar();    
         System.out.println("");
         System.out.println("Deseja inserir um novo valor? s/n");
             x = sc.next().charAt(0);
       }
 
       while(y != 'n'){    
         System.out.println("Digite a posição do valor a ser removido: ");       
             pos = sc.nextInt();
         System.out.println(lista.remover(pos)); 
         System.out.println("Sua lista contém os elementos: ");
             lista.printar();    
         System.out.println("");             
         System.out.println("Deseja remover um novo valor? s/n");
             y = sc.next().charAt(0);
       }
       
         System.out.println("Retorna TRUE caso a lista esteja vazia e FALSE caso tenha algum elemento nela: ");
         System.out.println(lista.vazia());
         System.out.println("Retorna TRUE caso a lista esteja cheia e FALSE caso contrário: ");
         System.out.println(lista.cheia());
         System.out.println("Quantidade de elementos da sua lista: ");
         System.out.println(lista.tamanho());

       while(w != 'n'){               
         System.out.println("Digite a posição do elemento que deseja vizualizar: ");
             pos = sc.nextInt();
         System.out.println(lista.elemento(pos));          
         System.out.println("Deseja analisar outro elemento? s/n");
             w = sc.next().charAt(0);
       }

       while(z != 'n'){
         System.out.println("Digite o elemento da posição que deseja vizualizar: ");
             dado = sc.nextInt();
         System.out.println(lista.posicao(dado));          
         System.out.println("Deseja analisar outra posição? s/n");
             z = sc.next().charAt(0);         
       }

        sc.close();
    }
}
