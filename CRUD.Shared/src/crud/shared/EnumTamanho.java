/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.shared;

import java.util.HashMap;

/**
 *
 * @author Fábio
 */
public enum EnumTamanho {
    PP (1,"PP"),
    P (2,"P"),
    M (3,"M"),
    G (4,"G"),
    GG (5,"GG"),
    XG (6,"XG"),
    XXG (7,"XXG"),
    G3 (8,"3G"),
    G4 (9,"4G"),
    G5 (10,"5G");
    
    private final int valor;
    private final String descricao;
    public static HashMap<Integer, EnumTamanho> m = new HashMap<Integer,EnumTamanho>();
    
    private EnumTamanho(int i, String s){
        valor = i;
        descricao = s;
    }
    
    static {
        for(EnumTamanho e : EnumTamanho.values()){
            m.put(e.valor, e);
        }
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public static EnumTamanho Valor(int i){
        return (EnumTamanho) m.get(i);
    }
}
