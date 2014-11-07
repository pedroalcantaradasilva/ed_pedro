/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeadas;

/**
 *
 * @author Alcântara's Note
 */
class No {
    private String nome;              // armazena o nome da pessoa
   private String palavra;           // armazena a pessoa
   private int idade;
   private No anterior;              
// -------------------------------------------------------------
   public No(String n, String p, int id) // metodo construtor
      {
      nome = n;                 // initializa os dois atributos do No
      palavra = p;                 // o No next a principio fica como null
      idade = id;
      }                           // 
// -------------------------------------------------------------
   public String getNo()      // mostra os valores do proprio nó
      {
      return "Nome: " + nome + " Palavra: " + palavra + "Idade: " + idade;
      }
   
   public void setAnterior(No n){
       anterior = n;
   }
   
   public No getAnterior(){
       return anterior;
   }   
   
    public String getNome(){
       return nome;
   } 
    
    public int getIdade(){
       return idade;
   } 
      
   }  // fim da classe nó
////////////////////////////////////////////////////////////////
 

