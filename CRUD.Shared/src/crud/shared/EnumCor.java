/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.shared;

import java.util.HashMap;

public enum EnumCor {
    PRETO(1, "Preto"),
    BRANCO(2, "Branco"),
    CINZA(3, "Cinza"),
    VERMELHO(4, "Vermelho"),
    AZUL(5, "Azul"),
    VERDE(6, "Verde"),
    AMARELO(7, "Amarelo"),
    ROXO(8, "Roxo"),
    LARANJA(9, "Laranja"),
    ROSA(10, "Rosa");
    
    private final int valor;
    private final String descricao;
    public static HashMap<Integer, EnumCor> m = new HashMap<Integer,EnumCor>();
    
    private EnumCor(int i, String s){
        valor = i;
        descricao = s;
    }
    
    static {
        for(EnumCor e : EnumCor.values()){
            m.put(e.valor, e);
        }
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public static EnumCor Valor(int i){
        return (EnumCor) m.get(i);
    }
}
