/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimples;

/**
 *
 * @author Alcântara's Note
 */
public class ListaSimples {
      private No prim;
      private No ult;
      private int quantiNo;
     
      public ListaSimples(){
            this.prim = null;
            this.ult = null;
            this.quantiNo = 0;
      }
      public int getQuantNos(){
            return this.quantiNo;
      }
      public No getUlt(){
            return this.ult;
      }
      public No getPrim(){
            return this.prim;
      }
      public boolean éVazia(){
            return (this.prim == null);
      }
      public void inserirPrimeiro(Item elem){
            No novoNo = new No(elem);
            if(this.éVazia()){
                  this.ult = novoNo;
            }
            novoNo.setProx(this.prim);
            this.prim = novoNo;
            this.quantiNo++;
      }
      public void inserirUltimo(Item elem){
            No novoNo = new No (elem);
            if(this.éVazia()){
                  this.prim = novoNo;
            }
            else{
                  this.ult.setProx(novoNo);
            }
            this.ult = novoNo;
            this.quantiNo++;
      }
      public No pesquisarNo(int chave){
            No atual = this.prim;
            while((atual != null) && (atual.getInfo().getChave() != chave)){
                  atual = atual.getProx();
            }
            return atual;
      }
      public boolean removerNo(int chave){
            No atual = this.prim;
            No ant = null;
            if(éVazia())
                  return false;
            else{
                  while((atual != null)&&(atual.getInfo().getChave() != chave)){
                        ant = atual;
                        atual = atual.getProx();
                  }
                  if(atual == null){
                        return false;
                  }
                  else{
                        if(atual == this.prim){//igual ao primeiro
                             if(this.prim == this.ult){//se for único
                                   this.ult = null;
                             }
                             this.prim = this.prim.getProx();
                        }
                        else{
                             if(atual == this.ult){//se for último
                                   this.ult = ant;
                             }
                             ant.setProx(atual.getProx());//se for no meio
                        }
                        this.quantiNo--;
                        return true;
                  }
            }
      }
    @Override
      public String toString(){
            String msg = "";
            No atual = this.prim;
            while(atual != null){
                  msg += atual.getInfo().getChave()+"\n";
                  atual = atual.getProx();
            }
            return msg;
      }

    private static class No {

        public No() {
        }

        private No(Item elem) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private No getProx() {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private Object getInfo() {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private void setProx(No prox) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}
