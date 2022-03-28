package br.com.sptech.projeto.encapsulamento1;

/**
 *
 * @author miniguiti
 */
public class ContaCorrente {
    private String nomeTitular;
    private Double saldo;

    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
    }  
    
    public void sacar(Double valorSaque){
        saldo -= valorSaque;
    }
    
}
