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

    enumTipoRepositorio repositorio = enumTipoRepositorio.Texto; //Por enquanto, aqui troca o tipo de repositorio
    DAO dao;
    
    public Dados() throws Exception{
        if (repositorio == enumTipoRepositorio.Texto){
            dao = new DAOTexto();
        }
    }
    
    public void salvarDados(RoupaModel model) throws Exception {
        try {
            if (Validacao.validaCodItem(model.getCodItem()) &&  Validacao.validaModel(model)) {
                model.setValorMargemLucro(model.getValorCompra() * 2);
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
            if (!Validacao.validaCodItem(model.getCodItem()) && Validacao.validaModel(model)) {
                model.setValorMargemLucro(model.getValorCompra() * 2);
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
            dao.Deletar(cod);
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }

    public RoupaModel ConsultarDados(int cod) throws Exception {
        try{
            return dao.Consultar(cod);
        }
        catch (Exception e){
            throw new Exception (e);
        }    
    }

    public ArrayList<RoupaModel> ListarDados() throws Exception {
        try{
            return dao.Listar();
        }
        catch (Exception e){
            throw new Exception (e);
        }
    }
    
    public void Finalizar() throws Exception{
        dao.Salvar();
    }
}
