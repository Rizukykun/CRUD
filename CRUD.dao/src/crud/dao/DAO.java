/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.shared.*;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public abstract class DAO {

    public abstract void Criar(RoupaModel roupa);

    public abstract void Atualizar(int codigo, RoupaModel roupa) throws Exception;

    public abstract void Deletar(int codigo) throws Exception;

    public abstract RoupaModel Consultar(int codigo) throws Exception;

    public abstract ArrayList<RoupaModel> Listar() throws Exception;

    public abstract boolean Salvar() throws Exception;
}
