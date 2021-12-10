/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Comparator;

/**
 *
 * @author Nicolas
 */
public class ComparatorNomeProduto implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
    
}
