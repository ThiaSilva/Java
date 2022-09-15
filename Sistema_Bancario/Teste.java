/**
 * Classe para serem feitos testes unitarios
*/

public class Teste {

    public static void main(String[] args) {

        // Operacao em conta Corrente
        Conta cc = new Conta();

        cc.saldo = 50.0;
        cc.agencia = 1234;
        cc.numero = 4321;

        System.out.println("Saldo atual da conta corrente: " + cc.numero + " Agencia: " + cc.agencia + " é de: R$" + cc.saldo);
        cc.depostirar(1000);
        System.out.println("Feito Deposito de R$1000,00 ");
        System.out.println("Saldo em Conta corrente: R$" + cc.verificarSaldo());

        // Operacao em conta poupanca
        Conta poupanca = new Conta();

        poupanca.saldo = 150 ;
        poupanca.agencia = 1234;
        poupanca.numero = 4321;

        System.out.println("Saldo atual da conta poupanca: " + poupanca.numero + " Agencia: " + poupanca.agencia + " é de: R$" + poupanca.saldo);
        poupanca.retirar(100);
        System.out.println("Feito saque de R$100,00 ");
        System.out.println("Saldo em Conta poupanca: R$" + poupanca.verificarSaldo());

    }
}
