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
public class Produto {

    private static int geradorCodigo = 0;
    
    private int codigo;
    private String nome;
    private double valor;
    private String descricao;
    private Categoria categoria;
    private int qtd;

    public Produto(String nome, double valor, String descricao, Categoria categoria, int qtd) {
        this.codigo = geraCodigo(geradorCodigo);
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getCodigo() {
        return codigo;
    }

    public int geraCodigo(int cod) {
        return ++this.geradorCodigo;
    }

    public String toString() {
        return "Produto{" + ", nome=" + nome + 
                ", valor=" + valor + ", descricao=" + descricao + 
                ", categoria=" + categoria + ", qtd=" + qtd + '}';
    }

}
