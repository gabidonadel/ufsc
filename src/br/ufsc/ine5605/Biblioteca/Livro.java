package br.ufsc.ine5605.Biblioteca;
import java.util.ArrayList;

public class Livro {
    
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private ArrayList<Autor> autores;
    private ArrayList<Capitulo> capitulos;


    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        autores = new ArrayList<Autor>();
        autores.add(autor);
        capitulos= new ArrayList<Capitulo>();
        capitulos.add(new Capitulo(numeroCapitulo, tituloCapitulo));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }	 	  	  		      	      	 	     	     	        	 	

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public ArrayList<Autor> getAutores(){
        return autores;
    }
    
    public void incluirAutor(Autor autor){
        if(autor != null){
            for(Autor autorIncluso : autores){
                if(autorIncluso.getCodigo() == autor.getCodigo()){
                    return;
                }
            }
            autores.add(autor);
        }
    }
    
    public void excluirAutor(Autor autor){
        if(autores.contains(autor)){
            autores.remove(autor);
        }	 	  	  		      	      	 	     	     	        	 	
    }
    
    public void incluirCapitulo(int numero, String tituloCapitulo){
        for(Capitulo cap : capitulos){
            if(cap.getTitulo().matches(tituloCapitulo)){
                return;
            }
        }
        Capitulo capitulo = new Capitulo(numero, tituloCapitulo);
        capitulos.add(capitulo);
    }
    
    public void excluirCapitulo(String tituloCapitulo){
        if(capitulos.size()>0 && tituloCapitulo != null){
            for(Capitulo cap : capitulos){
                if(tituloCapitulo.matches(cap.getTitulo())){
                    capitulos.remove(cap);
                    return;
                }
            }
        }
    }
    
    public String getListaCapitulos(){
        String lista = "";
        for(Capitulo cap : capitulos){
            lista += cap.getTitulo() + "\n";
        }
        return lista;
    }
    
    public Capitulo findCapituloByTitulo(String tituloCapitulo){
        for(Capitulo capitulo : capitulos){
            if(capitulo.getTitulo().matches(tituloCapitulo)){
                return capitulo;
            }
        }
        return null;
    }
    
    
    
}	 	  	  		      	      	 	     	     	        	 	
