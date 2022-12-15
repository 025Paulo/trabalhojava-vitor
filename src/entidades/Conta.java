package entidades;

public class Conta {
    private String numeroConta;
    private Double valorDebito;
    private Double valorCredito;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(String numeroConta, Double valorDebito, Double valorCredito, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.valorDebito = valorDebito;
        this.valorCredito = valorCredito;
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(Double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void realizarDeposito(Double valorDeposito){

    }

    public void valorSaque(Double valorSaque){

    }
}
