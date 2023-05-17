/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Crie uma classe chamada "Gerente" que herda da classe "Funcionario" e possui um atributo privado "bonus".
Utilize encapsulamento para permitir o acesso ao atributo "bonus" por meio de métodos getters e setters.

 */
package exercicios.exercicio5;

/**
 *
 * @author allan
 */
public class Funcionario {
    
     private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
