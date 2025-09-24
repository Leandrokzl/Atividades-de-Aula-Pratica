/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package redes.gerenciabanco;
import java.util.Scanner;
/**
 *
 * @author Leandro
 */
public class GerenciaBanco {

    public static void main(String[] args) {
    // Inicializa o scanner para ler a entrada do teclado
       Scanner entrada = new Scanner(System.in);
       
       //Criar um objeto usuario
       Usuario usuario1 = new Usuario("Leandro","Costa","000000000000",00);
       
       // Criar o objeto de procedimentos bancários
        ProcedimentosBancarios operacoes = new ProcedimentosBancarios();
        
       boolean continuar = true;//Iniciar o sistema
       System.out.println("-----------Bem-Vindo ao Sistema bancario------------------");
       usuario1.exibirDados();//exibir dados do usuario
       
       while(continuar){
            System.out.println("\n----------------------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar (Saque)");
            System.out.println("4. Sair");
            System.out.println("----------------------------------");
            
            int opcao = entrada.nextInt();
            switch (opcao) {
                 case 1:
                    operacoes.consultarSaldo(usuario1);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = entrada.nextDouble();
                    operacoes.realizarDeposito(usuario1, valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para retirada: ");
                    double valorRetirada = entrada.nextDouble();
                    operacoes.realizarSaque(usuario1, valorRetirada);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
       }
       
       System.out.println("-----------Bye----Bye------------------");
        entrada.close();
       
       
       
    }
}
