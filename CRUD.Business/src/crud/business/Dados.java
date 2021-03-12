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

    public void salvarDados(RoupaModel model) throws Exception {
        try {
            if (Validacao.validaModel(model)) {
                model.setValorMargemLucro(model.getValorCompra() * 2);
                DAO dao = new DAO();
                dao.Criar(model);
            } else {
                throw new Exception("Dados informados não estão validos");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void atualizarDados(RoupaModel model) throws Exception {
        try {
            if (Validacao.validaModel(model)) {
                model.setValorMargemLucro(model.getValorCompra() * 2);
                DAO dao = new DAO();
                dao.Atualizar(model.getCodItem(), model);
            } else {
                throw new Exception("Dados informados não estão validos");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void removerDados(int cod) throws Exception{
        try{
            DAO dao = new DAO();
            dao.Deletar(cod);
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }

    public RoupaModel ConsultarDados(int cod) throws Exception {
        try{
            DAO dao = new DAO();
            return dao.Consultar(cod);
        }
        catch (Exception e){
            throw new Exception (e);
        }    
    }

    public ArrayList<RoupaModel> ListarDados() throws Exception {
        try{
            DAO dao = new DAO();
            return dao.Listar();
        }
        catch (Exception e){
            throw new Exception (e);
        }
    }
}
