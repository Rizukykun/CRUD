/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.shared;

import java.time.*;

public class RoupaModel {

    public EnumTamanho getTamanhoRoupa() {
        return tamanhoRoupa;
    }

    public void setTamanhoRoupa(EnumTamanho tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    public EnumCor getCorRoupa() {
        return corRoupa;
    }

    public void setCorRoupa(EnumCor corRoupa) {
        this.corRoupa = corRoupa;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getLocalDeCompra() {
        return localDeCompra;
    }

    public void setLocalDeCompra(String localDeCompra) {
        this.localDeCompra = localDeCompra;
    }

    public String getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(String tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    public String getMarcaRoupa() {
        return marcaRoupa;
    }

    public void setMarcaRoupa(String marcaRoupa) {
        this.marcaRoupa = marcaRoupa;
    }

    public String getCaracteristicasRoupa() {
        return caracteristicasRoupa;
    }

    public void setCaracteristicasRoupa(String caracteristicasRoupa) {
        this.caracteristicasRoupa = caracteristicasRoupa;
    }

    public double getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(double valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorMargemLucro() {
        return valorMargemLucro;
    }

    public void setValorMargemLucro(double valorMargemLucro) {
        this.valorMargemLucro = valorMargemLucro;
    }

    public double getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(double precoSugerido) {
        this.precoSugerido = precoSugerido;
    }
    
    private EnumTamanho tamanhoRoupa;
    private EnumCor corRoupa;
    private int codItem; 
    private LocalDate dataEntrada; 
    private String localDeCompra; 
    private String tipoRoupa; 
    private String marcaRoupa; 
    private String caracteristicasRoupa;     
    private double valorEtiqueta;
    private double valorCompra; 
    private double valorMargemLucro; 
    private double precoSugerido;
}
