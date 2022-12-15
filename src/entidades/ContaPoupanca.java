package entidades;

public class ContaPoupanca extends Conta{
    private Double rentabilidadeMensal;

    public ContaPoupanca(String numeroConta, Double valorDebito, Double valorCredito, Double rentabilidadeMensal) {

        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public ContaPoupanca() {

    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double calcularSaldo(){
        return null;
    }
}
