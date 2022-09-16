/**
 * Classe para serem feitos testes unitarios
*/

public class Teste {

    public static void main(String[] args) {

        // Operacao em conta Corrente
        Conta cc = new Conta();

        cc.depostirar(50.5);
        cc.setAgencia(1234);
        cc.setNumero(4321);

        System.out.println("Saldo atual da conta corrente: " + cc.getNumero() + " Agencia: " + cc.getAgencia() + " é de: R$" + cc.getSaldo());
        cc.depostirar(1000);
        System.out.println("Feito Deposito de R$1000,00 ");
        System.out.println("Saldo em Conta corrente: R$" + cc.getSaldo());

        // Operacao em conta poupanca
        Conta poupanca = new Conta();

        poupanca.depostirar(150.0);
        poupanca.setAgencia(1234);
        poupanca.setNumero(4321);

        System.out.println("Saldo atual da conta poupanca: " + poupanca.getNumero() + " Agencia: " + poupanca.getAgencia() + " é de: R$" + poupanca.getSaldo());
        poupanca.retirar(100);
        System.out.println("Feito saque de R$100,00 ");
        System.out.println("Saldo em Conta poupanca: R$" + poupanca.getSaldo());

    }
}
