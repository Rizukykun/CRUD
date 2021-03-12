/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.business;

import crud.shared.RoupaModel;
import crud.business.Validacao;

public class Dados {
    private boolean salvarDados(RoupaModel model){
        if (Validacao.validaModel(model)){
            //envia pro 'dao'
            return true;
        }
        else{
            return false;
        }
    }
}
