/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.shared.*;
import java.io.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class DAO {
    public DAO() throws Exception{
        Carregar();
    }

    private HashMap<Integer, RoupaModel> listaRoupas = new HashMap<Integer, RoupaModel>();
    private File dados = new File("dados.txt");

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

    public ArrayList<RoupaModel> Listar() throws Exception {
        if (!listaRoupas.isEmpty()) {
            ArrayList<RoupaModel> lista = new ArrayList<RoupaModel>(listaRoupas.values());
            return lista;
        } else {
            throw new Exception("Lista Vazia!");
        }
    }

    public boolean Salvar() throws Exception {
        try {
            ArrayList<RoupaModel> roupas = Listar();
            FileWriter writer = new FileWriter("dados.txt");
            if (!dados.createNewFile()) {
                dados.delete();
                dados.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            for (RoupaModel r : roupas) {
                sb.append(r.getCodItem() + "╚"
                        + r.getCorRoupa() + "╚"
                        + r.getDataEntrada() + "╚"
                        + r.getPrecoSugerido() + "╚"
                        + r.getTamanhoRoupa() + "╚"
                        + r.getValorCompra() + "╚"
                        + r.getValorEtiqueta() + "╚"
                        + r.getValorMargemLucro() + "╚"
                        + r.getCaracteristicasRoupa() + "╚"
                        + r.getLocalDeCompra() + "╚"
                        + r.getMarcaRoupa() + "╚"
                        + r.getTipoRoupa() + System.lineSeparator());
            }
            writer.write(sb.toString());
            return true;
        } 
        catch (Exception e) {
            throw new Exception("Algo de errado não está certo...");
        }
    }
    private void Carregar () throws Exception{
        Scanner scanner = new Scanner(dados);
        RoupaModel roupa = new RoupaModel();
        while (scanner.hasNextLine()){
            String atributosLinha[] = scanner.nextLine().split("╚");
            roupa.setCodItem(Integer.parseInt(atributosLinha[0]));
            roupa.setCorRoupa(EnumCor.valueOf(atributosLinha[1]));
            roupa.setDataEntrada(LocalDate.parse(atributosLinha[2]));
            roupa.setPrecoSugerido(Double.parseDouble(atributosLinha[3]));
            roupa.setTamanhoRoupa(EnumTamanho.valueOf(atributosLinha[4]));
            roupa.setValorCompra(Double.parseDouble(atributosLinha[5]));
            roupa.setValorEtiqueta(Double.parseDouble(atributosLinha[6]));
            roupa.setValorMargemLucro(Double.parseDouble(atributosLinha[7]));
            roupa.setCaracteristicasRoupa(atributosLinha[8]);
            roupa.setLocalDeCompra(atributosLinha[9]);
            roupa.setMarcaRoupa(atributosLinha[10]);
            roupa.setTipoRoupa(atributosLinha[11]);
            listaRoupas.put(roupa.getCodItem(), roupa);
        }
    }
}
