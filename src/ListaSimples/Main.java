/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimples;

import java.util.Scanner;

/**
 *
 * @author Alcântara's Note
 */
public class Main {
    public static void main(String[]args){
            ListaSimples lista = new ListaSimples();
            int escolha;
            char opcao;
            do{
                  opcao = menu();
                  switch(opcao){
                  case '1':
                        System.out.println("Inserir um valor no início da lista\nDigite um valor.");
                        escolha = new Scanner(System.in).nextInt();
                        lista.inserirPrimeiro(new Item (escolha));
                        break;
                  case '2':
                        System.out.println("Inserir um valor no final da lista\nDigite um valor.");
                        escolha = new Scanner(System.in).nextInt();
                        lista.inserirUltimo(new Item(escolha));
                        break;
                  case '3':
                        if(lista.éVazia()){
                             System.out.println("A lista está vazia.");
                        }
                        else{
                             System.out.println("Localizar um valor\nDigite um valor.");
                             escolha = new Scanner(System.in).nextInt();
                             if(lista.pesquisarNo(escolha) == null){
                                   System.out.println("O "+escolha+" não foi encontrado.");
                             }
                             else{
                                   System.out.println("O "+escolha+" foi encontrado.");
                             }
                        }
                        break;
                  case '4':
                        if(lista.éVazia()){
                             System.out.println("A lista está vazia.");
                        }
                        else{
                             System.out.println("Escluir um elemento da lista\nDigite um valor.");
                             escolha = new Scanner(System.in).nextInt();
                             if(lista.removerNo(escolha)){
                                   System.out.println("Remoção efetuada com sucesso.");
                             }
                             else{
                                   System.out.println("remoção não efetuada.");
                             }
                        }
                        break;
                  case '5':
                        System.out.println("Exibir a lista?\n"+lista.toString());
                        break;
                  case '6':
                        System.out.println("Fim do programa.");
                        break;
                  default:
                        System.out.println("opção inválida, tente novamente.");
                  }
            }while(opcao != '6');
            System.exit(0);
      }
      public static char menu(){
            String msg;
            System.out.println("Escolha uma opção:\n1. Inserir nó no início.\n2. Inserir nó no final.\n3. Localizar nó.\n4. Excluir nó.\n5. Exibir Lista.\n6. Sair.");
            msg = new Scanner(System.in).next();
            return msg.charAt(0);
      }
    
}
