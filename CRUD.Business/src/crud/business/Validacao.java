package crud.business;

import java.time.*;
import crud.shared.RoupaModel;

/*
 * Possui as validações para todos os itens da RoupaModel, com excessão dos Enums
 */
public class Validacao {

    public static boolean validaCodItem(int codItem) throws Exception {
        Dados dados = new Dados();
        try {
            for (RoupaModel r : dados.ListarDados()) {
                if (r.getCodItem() == codItem) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean validaDataEntrada(LocalDate dataEntrada) {
        return dataEntrada.isBefore(LocalDate.now());
    }

    public static boolean validaLocaldeCompra(String localDeCompra) {
        return stringIsNotNullOrBlank(localDeCompra);
    }

    public static boolean validaTipoRoupa(String tipoRoupa) {
        return stringIsNotNullOrBlank(tipoRoupa);
    }

    public static boolean validaMarcaRoupa(String marcaRoupa) {
        return stringIsNotNullOrBlank(marcaRoupa);
    }

    public static boolean validaCaracteristicasRoupa(String caracteristicasRoupa) {
        return stringIsNotNullOrBlank(caracteristicasRoupa);
    }

    public static boolean validaValorEtiqueta(double valorEtiqueta) {
        return doubleIsPositiveOrZero(valorEtiqueta);
    }

    public static boolean validaValorCompra(double valorCompra) {
        return doubleIsPositiveOrZero(valorCompra);
    }

    public static boolean validaPrecoSugerido(double precoSugerido) {
        return doubleIsPositiveOrZero(precoSugerido);
    }

    public static boolean validaModel(RoupaModel model) throws Exception {
        if (    validaDataEntrada(model.getDataEntrada())
                && validaLocaldeCompra(model.getLocalDeCompra())
                && validaTipoRoupa(model.getTipoRoupa())
                && validaMarcaRoupa(model.getMarcaRoupa())
                && validaCaracteristicasRoupa(model.getCaracteristicasRoupa())
                && validaValorEtiqueta(model.getValorEtiqueta())
                && validaValorCompra(model.getValorCompra())
                && validaPrecoSugerido(model.getPrecoSugerido())) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * Retorna true se a double informada for positiva ou zero
     */
    private static boolean doubleIsPositiveOrZero(double d) {
        return d >= 0;
    }

    /*
     * Retorna true se a string informada não for null ou estiver vazia
     */
    private static boolean stringIsNotNullOrBlank(String string) {
        return !(string == null || string.trim().length() == 0);
    }
}
