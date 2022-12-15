package entidades;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Pessoa u = new Pessoa();

        System.out.println("#### Cadastrar Usuário ####");

        System.out.println("Digite o nome do usuário:");
        u.setNome(sc.nextLine());

        System.out.println("Digite o telefone do usuário:");
        u.setTelefone(sc.nextLine());

        System.out.println("Digite o cpf do usuário:");
        u.setCpf(sc.nextLine());


        System.out.println("O usuário " + u.getNome() + " tem o telefone " + u.getTelefone() + " e o cpf " + u.getCpf());

        Conta c = new Conta();

        System.out.println("#### Cadastrar Conta ####");

        System.out.println("Digite o numero da Conta:");
        c.setNumeroConta(sc.nextLine());

        System.out.println("Digite o valor débido:");
        c.setValorDebito(sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite o valor do crédito:");
        c.setValorCredito(sc.nextDouble());

        System.out.println("Digite o cpf do usuário:");
        u.setCpf(sc.nextLine());

        Endereco e = new Endereco();

        System.out.println("#### Cadastrar Endereco ####");

        System.out.println("Digite o Cep:");
        e.setCep(sc.nextLine());

        System.out.println("Digite o Logradouro:");
        e.setLogradouro(sc.nextLine());

        System.out.println("Digite o Numero:");
        e.setNumero(sc.nextLine());

        System.out.println("Digite o Complemento:");
        e.setComplemento(sc.nextLine());

        System.out.println("Digite a Cidade:");
        e.setCidade(sc.nextLine());

        System.out.println("Digite a UF:");
        e.setUF(sc.nextLine());

        Cliente cli = new Cliente();

        System.out.println("#### Cadastrar Cliente ####");

        System.out.println("Digite o nome do usuário:");
        cli.setNome(sc.nextLine());

        System.out.println("Digite o telefone do usuário:");
        cli.setTelefone(sc.nextLine());

        System.out.println("Digite o cpf do usuário:");
        cli.setCpf(sc.nextLine());

        System.out.println("Cliente Vip? true/false:");
        cli.setVip(sc.nextBoolean());

        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("#### Cadastrar Conta Poupança ####");

        System.out.println("Digite a renda mensal da pessoa:");
        cp.setRentabilidadeMensal(sc.nextDouble());

        ContaCorrente cr = new ContaCorrente();

        System.out.println("#### Cadastrar Conta Corrente ####");

        System.out.println("Digite o limite da conta:");
        cr.setLimite(sc.nextDouble());

        Funcionario fun = new Funcionario();

        System.out.println("#### Cadastrar Funcionario ####");

        System.out.println("Digite o nome do usuário:");
        fun.setNome(sc.nextLine());
        sc.nextLine();

        System.out.println("Digite o telefone do usuário:");
        fun.setTelefone(sc.nextLine());

        System.out.println("Digite o cpf do usuário:");
        fun.setCpf(sc.nextLine());

        System.out.println("Digite o salário do funcionario:");
        fun.setSalario(sc.nextDouble());

        System.out.println("#### Realizar Deposito ####");

        System.out.println("Digite o nome do usuário:");
        u.setNome(sc.nextLine());
        sc.nextLine();

        System.out.println("Digite o número da conta:");
        c.setNumeroConta(sc.nextLine());

        System.out.println("Digite o valor do Deposito:");
        c.realizarDeposito(sc.nextDouble());
        System.out.println("Deposito feito com sucesso!");

        System.out.println("#### Realizar Saque ####");

        System.out.println("Digite o nome do usuário:");
        u.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Saque feito com sucesso!");

        System.out.println("Digite o número da conta:");
        c.setNumeroConta(sc.nextLine());

        System.out.println("Digite o valor do saque:");
        c.valorSaque(sc.nextDouble());

        Cargo car = new Cargo();

        System.out.println("#### Cadastrar Cargo ####");

        System.out.println("Digite o nome do cargo:");
        car.setNome(sc.nextLine());
        sc.nextLine();






























    }


}
