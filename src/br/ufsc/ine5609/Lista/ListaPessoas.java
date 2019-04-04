package br.ufsc.ine5609.Lista;

/**
 *
 * @author Dall Agnol
 */
public class ListaPessoas {
    
    private Item i;

    public ListaPessoas() {
    }
    
    public ListaPessoas(Pessoa p) {
        this.i = new Item(p);
    }
    
    public void adicionaEmPrimeiro(Pessoa p){
        Item primeiro = new Item(p);
        primeiro.setNext(this.i);
        this.i = primeiro;
    }
    
    public void adicionaEmUltimo(Pessoa p){
        Item ultimo = new Item(p);
        Item atual = this.i;
        while(atual.getNext() != null){
            atual = atual.getNext();
        }
        atual.setNext(ultimo);
    }
    
    public void adicionar(Pessoa p, int pos){
        Item item = new Item(p);
        Item atual = this.i;
        int count = 1;
        while(count!= pos-1){
            atual = atual.getNext();
            count++;
        }
        item.setNext(atual.getNext());
        atual.setNext(item);
    }
    
    public void adicionarAposPessoa(Pessoa p, Pessoa pos) throws Exception{
        Item item = new Item(p);
        Item atual = this.i;
        while( atual != null  && ((Pessoa)atual.getObj()) != pos){
            atual = atual.getNext();
        }
        
        if(atual == null){
            throw new Exception("Pessoa nao encontrada");
        }
        item.setNext(atual.getNext());
        atual.setNext(item);
    }
    
    public void excluiPrimeiro(){
        this.i = i.getNext();
    }
    
    public void excluiUltimo(){
        Item atual = this.i;
        Item anterior = atual;
        while(atual.getNext() != null){
            anterior = atual;
            atual = atual.getNext();
        }
        anterior.setNext(null);
    }

    public void excluir(Pessoa p){
        Item atual = this.i;
        Item anterior = atual;
        while( (Pessoa)atual.getObj() != p){
            anterior = atual;
            atual = atual.getNext();
        }
        anterior.setNext(atual.getNext());
    }
    
    public void excluir(int pos){
        Item anterior = this.i;
        Item atual = anterior.getNext();
        int count = 1;
        while(count!= pos-1){
            anterior = atual;
            atual = atual.getNext();
            count++;
        }
        anterior.setNext(atual.getNext());
        
    }
    
    public void imprimeLista(){
        Item atual = this.i;
        do{
            System.out.println(((Pessoa) atual.getObj()).getNome());
            atual = atual.getNext();
        }while(atual != null);
    }
    
}
