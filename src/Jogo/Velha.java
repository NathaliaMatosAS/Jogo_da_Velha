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
  boolean deuVelha=true;
    
    public void passarTurno(){
        turno += 1;
    }
    
    public void verificarResultado(){
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B12.getText().equals("X") && TelaInicial.B13.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B11.getText().equals("X") && TelaInicial.B21.getText().equals("X") && TelaInicial.B31.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B12.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B32.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B13.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B31.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B13.getText().equals("X") && TelaInicial.B23.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B21.getText().equals("X") && TelaInicial.B22.getText().equals("X") && TelaInicial.B23.getText().equals("X")){
            anunciarVencedor();
        }
        if(TelaInicial.B31.getText().equals("X") && TelaInicial.B32.getText().equals("X") && TelaInicial.B33.getText().equals("X")){
            anunciarVencedor();
        }
        
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B12.getText().equals("O") && TelaInicial.B13.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B11.getText().equals("O") && TelaInicial.B21.getText().equals("O") && TelaInicial.B31.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B12.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B32.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B13.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B31.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B13.getText().equals("O") && TelaInicial.B23.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B21.getText().equals("O") && TelaInicial.B22.getText().equals("O") && TelaInicial.B23.getText().equals("O")){
            anunciarVencedor();
        }
        if(TelaInicial.B31.getText().equals("O") && TelaInicial.B32.getText().equals("O") && TelaInicial.B33.getText().equals("O")){
            anunciarVencedor();
        }
        
        if(turno==10 && deuVelha==true){
            JOptionPane.showMessageDialog(null, "Deu Velha!");
            desabilitarJogo();
        }
        
    }
    
    public void anunciarVencedor(){
        if(turno%2==1){
            JOptionPane.showMessageDialog(null, j1.getNome()+" venceu!");
        }else{
            JOptionPane.showMessageDialog(null, j2.getNome()+" venceu!");
        }
        deuVelha=false;
        desabilitarJogo();
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
        TelaInicial.txtJogador1.setEnabled(false);
        TelaInicial.txtJogador2.setEnabled(false);
        TelaInicial.BtnX.setEnabled(false);
        TelaInicial.BtnO.setEnabled(false);
        TelaInicial.botaoINICIAR.setEnabled(false);
        TelaInicial.botaoFINALIZAR.setEnabled(true);
    }
    
    public void desabilitarJogo(){
        TelaInicial.B11.setEnabled(false);TelaInicial.B11.setText(" ");
        TelaInicial.B12.setEnabled(false);TelaInicial.B12.setText(" ");
        TelaInicial.B13.setEnabled(false);TelaInicial.B13.setText(" ");
        TelaInicial.B21.setEnabled(false);TelaInicial.B21.setText(" ");
        TelaInicial.B22.setEnabled(false);TelaInicial.B22.setText(" ");
        TelaInicial.B23.setEnabled(false);TelaInicial.B23.setText(" ");
        TelaInicial.B31.setEnabled(false);TelaInicial.B31.setText(" ");
        TelaInicial.B32.setEnabled(false);TelaInicial.B32.setText(" ");
        TelaInicial.B33.setEnabled(false);TelaInicial.B33.setText(" ");
        TelaInicial.botaoINICIAR.setEnabled(true);
        TelaInicial.botaoFINALIZAR.setEnabled(false);
        TelaInicial.txtJogador1.setEnabled(true);
        TelaInicial.txtJogador2.setEnabled(true);
        TelaInicial.BtnX.setEnabled(true);
        TelaInicial.BtnO.setEnabled(true);
        
        
    }
    
    
}
