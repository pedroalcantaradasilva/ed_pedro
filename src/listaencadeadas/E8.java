/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaencadeadas;

import e8.ListaOrdenada;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaOrdenada theList = new ListaOrdenada();  // criada uma lista nova 
      Scanner ent = new Scanner(System.in);

      theList.InsertSort("Pamela", "Lucas", 18);
      theList.InsertSort("Vitor", "Lucas", 19);
      theList.InsertSort("Michele", "Vitor", 21);      
      theList.InsertSort("Leticia", "Michele", 22);
      theList.InsertSort("Miriam", "Leticia", 28);
      theList.InsertSort("Pedro", "Miriam", 36);

          System.out.println(theList.displayList());              // imprimi a lista
          
          System.out.println("Vamos fazer uma busca ... vamos buscar o Vitor ...");
          System.out.println(theList.busca("Vitor"));
          
          System.out.println("Digite um nome que você queira remover da lista!!!");
          if (!theList.isEmpty()) {
              if (theList.delete(ent.nextLine()) != null) {
                System.out.println("Nó deletado com sucesso!!!" );
                }
          }
             System.out.println("Vamos ver nossa nova lista!!!");       
                    
      System.out.println(theList.displayList());              // mostramos a lista
      }  // final do método main()
   }  // final da classe usuária

    
    

