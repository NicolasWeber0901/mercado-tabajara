/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nicolas
 */
public class TableModelCliente extends AbstractTableModel {

    private List<Cliente> clientes;

    public TableModelCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public int getRowCount() {
        return this.clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = this.clientes.get(rowIndex);
        
        switch(columnIndex){
            
            case 0: {
                return c.getCodigo();
            }
            
            case 1: {
                return c.getNome();
            }
            
            case 2:{
                return c.getCpf();
            }
            
            case 3: {
                return c.getTelefone();
            }
            
            case 4: {
                return c.getDataNascimento();
            }
            
            case 5: {
                return c.getEndereco().getCidade();
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
                return "CPF";
            }
            
            case 3: {
                return "Telefone";
            }
            
            case 4: {
                return "Data";
            }
            
            case 5: {
                return "Cidade";
            }
            
            default: {
                return "-:-";
            }
        }
    }
    
    public void removeRow(int linha) {
        this.clientes.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
