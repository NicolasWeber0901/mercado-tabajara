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
public class Cliente extends Pessoa{

    public Cliente(String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, String usuario, String senha) {
        super(nome, cpf, dataNascimento, telefone, endereco, usuario, senha);
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
    
    
}
