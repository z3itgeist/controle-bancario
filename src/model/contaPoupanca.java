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
public class contaPoupanca extends conta {
    
    private double reajusteMensal;

    public contaPoupanca() {
    }

    public contaPoupanca(double reajusetMensal) {
        this.reajusteMensal = reajusteMensal;
    }

    public double getReajusteMensal() {
        return reajusteMensal;
    }

    public void setReajusteMensal(double reajusteMensal) {
        this.reajusteMensal = reajusteMensal;
    }
    
    public void calcularReajuste(int nC, double s){
        if (this.getSaldo()>0) {
           this.reajusteMensal = (this.getSaldo() * (1.5/100));
        }else {
        JOptionPane.showMessageDialog(null, "Sem saldo disponível para operação");
    }
    }
    
    public void mostrarReajuste(int nC, double s){
        JOptionPane.showMessageDialog(null, (this.reajusteMensal));
    }
    
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, (this.getSaldo()+this.reajusteMensal));
    }
    
}
