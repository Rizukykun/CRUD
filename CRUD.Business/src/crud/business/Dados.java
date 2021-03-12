/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.business;

import crud.shared.RoupaModel;
import java.util.ArrayList;
import crud.dao.*;

public class Dados {
    public Dados(){
        
    }
    
    public void salvarDados(RoupaModel model) throws Exception{
        try
        {
        if (Validacao.validaModel(model)){
            model.setValorMargemLucro(model.getValorCompra() * 2);
            DAO dao = new DAO();
            dao.Criar(model);
        }
        else{
            throw new Exception("Dados informados não estão validos");
        }
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }
    
    public void AtualizarDados (RoupaModel model) throws Exception{
        if (Validacao.validaModel(model)){
            
        }
        else{
            throw new Exception("Dados informados não estão validos");
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
