/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.business;

import crud.shared.RoupaModel;
import java.util.ArrayList;

public class Dados {
    public Dados(){
        
    }
    
    public boolean salvarDados(RoupaModel model){
        if (Validacao.validaModel(model)){
            model.setValorMargemLucro(model.getValorCompra() * 2);
            //envia pro 'dao'
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean AtualizarDados (RoupaModel model){
        if (Validacao.validaModel(model)){
            //envia pro 'dao'
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean RemoverDados (int cod){
        //envia pro dao
        return true;
    }
    
    public RoupaModel ConsultarDados (int cod) throws Exception{
        //consulta o dao
        throw new Exception("dao não implementado ainda");
    }
    
    public ArrayList<RoupaModel> ListarDados () throws Exception{
        //consulta o dao
        throw new Exception("dao não implementado ainda");
    }
}
