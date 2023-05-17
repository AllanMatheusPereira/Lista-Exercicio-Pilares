/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Exercicio 3
- Crie uma classe chamada "ContaCorrente" que herda da classe "ContaBancaria" e possui um método para 
calcular o valor do cheque especial disponível para o titular da conta.
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 */
public class ContaBancaria {
    
    private double Saldo;
    private String Titular;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }
 
}
