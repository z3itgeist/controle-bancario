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
public class conta {
    
    private int numeroConta;
    private double saldo;

    public conta() {
    }

    public conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void creditar (int nC, double v) {
        this.saldo = this.saldo+v;
    }
    
    public void debitar (int nC, double v) {
        
        if (this.saldo>=v){
            this.saldo = this.saldo-v;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo de conta insuficiente");
        }
    }
    
    public void mostrarSaldo (){
        JOptionPane.showMessageDialog(null, this.saldo);
    }
    
    
    
    
    
}
