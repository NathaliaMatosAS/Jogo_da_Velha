/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import javax.swing.JOptionPane;


public class Velha {
  Jogador j1 = new Jogador();  
  Jogador j2 = new Jogador();
  int turno;    
  String simboloX="X";
  String simboloO="O";
  
   public void iniciarPartida(String nome1, String nome2, String simb1, String simb2){
        j1.modificarAtributos(nome1, simb1);
        j2.modificarAtributos(nome2, simb2);
        turno = 0;
    }
    
    public void passarTurno(){
        turno += 1;
    }
    
    public void verificarResultado(){
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B12.getText().equals("X") && TelaInicial.B13.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B21.getText().equals("X") && TelaInicial.B31.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B12.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B32.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B13.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B31.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B13.getText().equals("X") && TelaInicial.B23.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B21.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B23.getText().equals("X")){
            anunciarVencedorX();
        }
        if(TelaInicial.B31.getText().equals("X") && TelaInicial.B32.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedorX();
        }
        
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B12.getText().equals("O") && TelaInicial.B13.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B21.getText().equals("O") && TelaInicial.B31.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B12.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B32.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B13.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B31.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B13.getText().equals("O") && TelaInicial.B23.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B21.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B23.getText().equals("O")){
            anunciarVencedorO();
        }
        if(TelaInicial.B31.getText().equals("O") && TelaInicial.B32.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedorO();
        }
        
        if(turno==10){
            JOptionPane.showMessageDialog(null, "Deu Velha!");
        }
        
    }
    
    public void anunciarVencedorX(){
        if(j1.getSimbolo()=="X"){
                JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
        }
        if(j2.getSimbolo()=="X"){
                JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
        }
    }
    
    public void anunciarVencedorO(){
    if(j1.getSimbolo()=="O"){
            JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
    }
    if(j2.getSimbolo()=="O"){
            JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
    }
}
    public void habilitarJogo(){
        TelaInicial.B11.setEnabled(true);
        TelaInicial.B12.setEnabled(true);
        TelaInicial.B13.setEnabled(true);
        TelaInicial.B21.setEnabled(true);
        TelaInicial.B22.setEnabled(true);
        TelaInicial.B23.setEnabled(true);
        TelaInicial.B31.setEnabled(true);
        TelaInicial.B32.setEnabled(true);
        TelaInicial.B33.setEnabled(true);
    }
    
    
}
