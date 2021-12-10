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
public class MyRowFilterNome extends RowFilter {

    private String searchText;

    public MyRowFilterNome(String searchText) {
        this.searchText = searchText;
    }

    public MyRowFilterNome() {

    }

    /*
    Cada Entry corresponte a uma linha da tabela, e usando o true ou false, 
    você determina se essa linha vai ser mostrada ou não.
     */
    @Override
    public boolean include(Entry entry) {
        /*
        getStringValue retorna o texto daquela linha e o número corresponde 
        a coluna. O indexOf vai comparar se o texto digitado também aparece
        dentro de um certo texto, se sim, ele retorna um número maios ou igual 
        a 0, para indicar a localização do texto.
         */
        return entry.getStringValue(1).indexOf(searchText) >= 0;
    }
}
