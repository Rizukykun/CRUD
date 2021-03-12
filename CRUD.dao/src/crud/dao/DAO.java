/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.shared.*;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class DAO {

    private HashMap<Integer, RoupaModel> listaRoupas = new HashMap<Integer, RoupaModel>();

    public void Criar(RoupaModel roupa) {
        listaRoupas.put(roupa.getCodItem(), roupa);
    }

    public void Atualizar(int codigo, RoupaModel roupa) throws Exception {
        if (listaRoupas.containsKey(codigo)) {
            listaRoupas.replace(codigo, roupa);
        } else {
            throw new Exception("Código não encotrado! Atualização não realizada");
        }
    }

    public void Deletar(int codigo) throws Exception {
        if (listaRoupas.containsKey(codigo)) {
            listaRoupas.remove(codigo);
        } else {
            throw new Exception("Código não encotrado! Deleção não realizada");
        }
    }

    public RoupaModel Consultar(int codigo) throws Exception {
        if (listaRoupas.containsKey(codigo)) {
            return listaRoupas.get(codigo);
        } else {
            throw new Exception("Código não encotrado! Deleção não realizada");
        }
    }

    public ArrayList<RoupaModel> Listar() throws Exception{
        if (!listaRoupas.isEmpty()) {
            ArrayList<RoupaModel> lista = new ArrayList<RoupaModel>(listaRoupas.values());
            return lista;
        }
        else {
            throw new Exception("Lista Vazia!");
        }
    }
}
