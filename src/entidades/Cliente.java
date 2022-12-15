package entidades;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {

    private ArrayList<Conta> listContas;
    private ArrayList<Endereco> listEnderecos;
    private boolean vip;

    public Cliente(String nome, String cpf, String telefone, ArrayList<Conta> listContas, ArrayList<Endereco> listEnderecos, boolean vip) {
        super(nome, cpf, telefone);
        this.listContas = listContas;
        this.listEnderecos = listEnderecos;
        this.vip = vip;
    }

    public Cliente(ArrayList<Conta> listContas, ArrayList<Endereco> listEnderecos, boolean vip) {
        this.listContas = listContas;
        this.listEnderecos = listEnderecos;
        this.vip = vip;
    }

    public Cliente() {

    }

    public ArrayList<Conta> getListContas() {
        return listContas;
    }

    public void setListContas(ArrayList<Conta> listContas) {
        this.listContas = listContas;
    }

    public ArrayList<Endereco> getListEnderecos() {
        return listEnderecos;
    }

    public void setListEnderecos(ArrayList<Endereco> listEnderecos) {
        this.listEnderecos = listEnderecos;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
