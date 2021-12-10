/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Nicolas
 */
public class Pedido {

    private static int geradorCodigo = 0;

    private int codigo;
    private Set<Produto> produtos;
    private String formaPagamento;
    private double total;

    public Pedido(Set<Produto> produtos, String formaPagamento, double total) {
        this.codigo = geraCodigo(geradorCodigo);
        this.produtos = this.produtos = new HashSet<>();
        this.formaPagamento = formaPagamento;
        this.total = total;
    }

    public double calculaTotal(){
        for(Produto p : this.produtos){
            this.total += p.getValor();
        }
        
        return this.total;
    }
    
    private int geraCodigo(int geradorCodigo) {
        return ++this.geradorCodigo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", produtos=" + produtos + ", formaPagamento=" + formaPagamento + ", total=" + total + '}';
    }

}
