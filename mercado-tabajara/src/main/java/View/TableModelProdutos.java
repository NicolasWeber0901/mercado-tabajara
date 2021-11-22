/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nicolas
 */
public class TableModelProdutos extends AbstractTableModel {

    private List<Produto> produtos;

    public TableModelProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public int getRowCount() {
        return this.produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto p = this.produtos.get(rowIndex);
        
        switch(columnIndex){
            
            case 0: {
                return p.getCodigo();
            }
            
            case 1: {
                return p.getNome();
            }
            
            case 2:{
                return p.getCategoria();
            }
            
            case 3: {
                return p.getDescricao();
            }
            
            case 4: {
                return p.getValor();
            }
            
            case 5: {
                return p.getQtd();
            }
            
            default: {
                return "Coluna sem valor";
            }
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: {
                return "Código";
            }
            
            case 1: {
                return "Nome";
            }
            
            case 2: {
                return "Categoria";
            }
            
            case 3: {
                return "Descrição";
            }
            
            case 4: {
                return "Valor";
            }
            
            case 5: {
                return "Quantidade";
            }
            
            default: {
                return "-:-";
            }
        }
    }
    
}
