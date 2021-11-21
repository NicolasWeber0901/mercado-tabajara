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
public class Sistema {
    public static void main(String[] args) {
        //Classe temporária apenas para fins de teste antes das interfaces.
        
        Categoria c1 = new Categoria("Pipipipopo", "papapapa");
        
        Produto p1 = new Produto("Vassoura", 19.90, "Vassourinha", c1, 10);
        Produto p2 = new Produto("Lápis", 19.90, "Preto", c1, 18);
        Produto p3 = new Produto("Chuveiro", 19.90, "Elétrico", c1, 9);
        Produto p4 = new Produto("Shampoo", 19.90, "pipipopo", c1, 5);
        
        Endereco end1 = new Endereco("Rua 1", "Centro", 89155000, 02);
        
        Estoque e1 = new Estoque("Estoque 1", end1);
        
        e1.getProdutos().put(p1.getCodigo(), p1);
        e1.getProdutos().put(p2.getCodigo(), p2);
        e1.getProdutos().put(p3.getCodigo(), p3);
        e1.getProdutos().put(p4.getCodigo(), p4);
        
        e1.listaProduto();
        e1.listaProduto(2);
        e1.listaProduto("Lápis");
    }
}
