/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author braga
 */
public class contaCorrente extends conta {
    
    private double limiteEspecial;

    public contaCorrente() {
    }

    public contaCorrente(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    public void calcularLimite(int nC, double s) {
        if (this.getSaldo()>0) {
           this.limiteEspecial = (this.getSaldo() * (15/100));
        }else {
        JOptionPane.showMessageDialog(null, "Sem saldo disponível para operação");
    }
        
    }
    
    public void mostrarLimite(int nC, double s) {
        JOptionPane.showMessageDialog(null, this.limiteEspecial);
    }
    
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, (this.getSaldo()+this.limiteEspecial));
    }
    
}
