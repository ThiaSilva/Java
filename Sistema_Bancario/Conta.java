import com.sun.org.apache.bcel.internal.generic.ILOAD;

import java.io.Serializable;

/**
 Esta classe e uma abstracao de uma conta bancaria contendo Agencia, Numero e
 Saldo. E como comportamento as funcoes de Depositar, Retirar e Verificar o Saldo
 @author : Thiago Carvalho
 */

public class Conta implements Serializable {

    // Estrutura e atributos da classe

    private int agencia;
    private int numero;
    private double saldo;

    // Construtor Padrao
    public Conta() {

    }

    // Construtor de Classe
    public Conta (int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
    public double getSaldo(){
        return this.saldo;
    }

}
