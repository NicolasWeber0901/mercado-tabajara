/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.RowFilter;

/**
 *
 * @author Nicolas
 */
public class MyRowFilterNome extends RowFilter{

    private String searchText;
    
    public MyRowFilterNome(String searchText) {
        this.searchText = searchText;
    }

    public MyRowFilterNome() {
        
    }
    
    @Override
    public boolean include(Entry entry) {
       return entry.getStringValue(1).indexOf(searchText) >= 0;
    }
}
