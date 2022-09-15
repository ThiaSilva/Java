/**
 Esta classe e uma abstracao de uma conta bancaria contendo Agencia, Numero e
 Saldo. E como comportamento as funcoes de Depositar, Retirar e Verificar o Saldo
 @author : Thiago Carvalho
 */

public class Conta {


    // Estrutura e atributos da classe

    int agencia;
    int numero;
    double saldo;

    // Construtor Padrao
    public Conta() {

    }

    // Construtor de Classe
    public Conta (int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
    }
    //método de depósitos
    public void depostirar (double saldo){
        this.saldo += saldo;
    }
    // Metodo de Saque
    public void retirar(double saldo) {
        this.saldo -= saldo;
    }
    // Metodo de verificacao de Saldo
    public double verificarSaldo(){
        return this.saldo;
    }

}
