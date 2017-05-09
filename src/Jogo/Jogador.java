
package Jogo;


public class Jogador {
    private String simbolo;
    private String nome;
    
    public Jogador(){
        simbolo = " ";
        nome = " ";
    }
    
    public void modificarAtributos(String nome, String simb ){
        this.setNome(nome);
        this.setSimbolo(simb);        
}

    /**
     * @return the simbolo
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * @param simbolo the simbolo to set
     */
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}