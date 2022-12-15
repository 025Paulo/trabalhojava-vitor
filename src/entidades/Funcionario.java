package entidades;

public class Funcionario extends Pessoa implements IUsuario{

    private Double salario;

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.salario = salario;
    }

    public Funcionario() {

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
