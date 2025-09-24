/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes.gerenciabanco;

/**
 *
 * @author Leandro
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
    //contrutor
    public Usuario(String nome, String sobrenome, String cpf, double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s %s%n", nome, sobrenome);
        System.out.printf("Cpf: %s%n", cpf);
        // O tipo de formatação para saldo deve ser %.2f
        System.out.printf("Seu saldo é de: R$ %.2f%n", saldo);
    }
    
    // Método público para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método público para definir o saldo (necessário para a classe de operações)
    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
