package crud.business;

import java.time.*;

/*
 * Possui as validações para todos os itens da RoupaModel, com excessão dos Enums
 */
public class Validacao {
    public boolean validaCodItem(int codItem){
        //Verificar se o código informado já existe no banco de dados
        return true;
    }
    public boolean validaDataEntrada(LocalDate dataEntrada){
        return dataEntrada.isBefore(LocalDate.now());
    }
    public boolean validaLocaldeCompra(String localDeCompra){
        return stringIsNotNullOrBlank(localDeCompra);
    }
    public boolean validaTipoRoupa(String tipoRoupa){
        return stringIsNotNullOrBlank(tipoRoupa);
    }
    public boolean validaMarcaRoupa(String marcaRoupa){
        return stringIsNotNullOrBlank(marcaRoupa);
    }
    public boolean validaCaracteristicasRoupa(String caracteristicasRoupa){
        return stringIsNotNullOrBlank(caracteristicasRoupa);
    }
    public boolean validaValorEtiqueta(double valorEtiqueta){
        return doubleIsPositiveOrZero(valorEtiqueta);
    }
    public boolean validaValorCompra(double valorCompra){
        return doubleIsPositiveOrZero(valorCompra);
    }
    public boolean validaPrecoSugerido(double precoSugerido){
        return doubleIsPositiveOrZero(precoSugerido);
    }    
    
    /*
     * Retorna true se a double informada for positiva ou zero
     */   
    private boolean doubleIsPositiveOrZero(double d){
        return d >= 0;
    }
    
    /*
     * Retorna true se a string informada não for null ou estiver vazia
     */ 
    private boolean stringIsNotNullOrBlank(String string) { 
        return !(string == null || string.trim().length() == 0);
    }
}
