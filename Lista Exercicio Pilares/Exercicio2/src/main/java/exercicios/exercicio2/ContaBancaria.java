/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Exercicio 2
Crie uma classe chamada "ContaBancaria" com atributos privados, como "saldo" e "titular".
Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.

 */
package exercicios.exercicio2;

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
