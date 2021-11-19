/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabajara.mercado.tabajara;

/**
 *
 * @author Nicolas
 */
public abstract class Pessoa {

    protected int geradorCodigo = 0;

    protected int codigo;
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected int telefone;
    protected Endereco endereco;
    protected String usuario;
    protected String senha;

    public Pessoa(int codigo, String nome, String cpf, String dataNascimento, int telefone, String usuario, String senha) {
        this.codigo = geraCodigo(geradorCodigo);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public int geraCodigo(int cod) {
        return ++this.geradorCodigo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome
                + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
                + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }

}
