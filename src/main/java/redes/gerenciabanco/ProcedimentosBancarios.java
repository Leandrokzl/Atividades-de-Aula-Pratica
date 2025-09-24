/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes.gerenciabanco;


/**
 *
 * @author Leandro
 */

public class ProcedimentosBancarios {

    public void consultarSaldo(Usuario usuario) {
        System.out.printf("Seu saldo é de: R$ %.2f%n", usuario.getSaldo());
    }

    public void realizarDeposito(Usuario usuario, double valor) {
        if (valor > 0) {
            double novoSaldo = usuario.getSaldo() + valor;
            usuario.setSaldo(novoSaldo);
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void realizarSaque(Usuario usuario, double valor) {
        if (valor > 0 && valor <= usuario.getSaldo()) {
            double novoSaldo = usuario.getSaldo() - valor;
            usuario.setSaldo(novoSaldo);
            System.out.printf("Retirada de R$ %.2f realizada com sucesso.\n", valor);
        } else if (valor > usuario.getSaldo()) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            System.out.println("Erro: O valor da retirada deve ser positivo.");
        }
    }
}
