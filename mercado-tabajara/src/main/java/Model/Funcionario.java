/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nicolas
 */
public class Funcionario extends Pessoa{
    private String funcao;

    public Funcionario(String funcao, String nome, String cpf, String dataNascimento, int telefone, Endereco endereco, String usuario, String senha) {
        super(nome, cpf, dataNascimento, telefone, endereco, usuario, senha);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + "funcao=" + funcao + '}';
    }
    
    
}
