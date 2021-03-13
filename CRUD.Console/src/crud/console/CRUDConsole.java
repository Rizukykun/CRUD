/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import crud.business.*;
import crud.shared.*;
import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author Fábio
 */
public class CRUDConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        Dados dados = new Dados();

        System.out.println("1-Cadastrar");
        System.out.println("2-Ler");
        System.out.println("3-Atualizar");
        System.out.println("4-Deletar");
        System.out.println("5-sair");

        System.out.println("\n" + "Digite um codigo:");
        int v1 = ler.nextInt();
        switch (v1) {
            case 1:
                RoupaModel model = new RoupaModel();

                while (true) {
                    System.out.println("Digite o codigo da compra");
                    int codItem = ler.nextInt();
                    if (Validacao.validaCodItem(codItem)) {
                        System.out.println("Ok");
                        model.setCodItem(codItem);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o data de entrada");
                    LocalDate dataEntrada = LocalDate.parse(ler.next());
                    if (Validacao.validaDataEntrada(dataEntrada)) {
                        System.out.println("Ok");
                        model.setDataEntrada(dataEntrada);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o local da compra");
                    String localDeCompra = ler.next();
                    if (Validacao.validaLocaldeCompra(localDeCompra)) {
                        System.out.println("Ok");
                        model.setLocalDeCompra(localDeCompra);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o tipo da compra");
                    String tipoRoupa = ler.next();
                    if (Validacao.validaTipoRoupa(tipoRoupa)) {
                        System.out.println("Ok");
                        model.setTipoRoupa(tipoRoupa);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite a marca de roupa");
                    String marcaRoupa = ler.next();
                    if (Validacao.validaMarcaRoupa(marcaRoupa)) {
                        System.out.println("Ok");
                        model.setMarcaRoupa(marcaRoupa);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o valor da compra");
                    double valorCompra = ler.nextDouble();
                    if (Validacao.validaValorCompra(valorCompra)) {
                        System.out.println("Ok");
                        model.setValorCompra(valorCompra);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o preço sugerido");
                    double precoSugerido = ler.nextDouble();
                    if (Validacao.validaPrecoSugerido(precoSugerido)) {
                        System.out.println("Ok");
                        model.setPrecoSugerido(precoSugerido);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Preço de etiqueta");
                    double valorEtiqueta = ler.nextDouble();
                    if (Validacao.validaValorEtiqueta(valorEtiqueta)) {
                        System.out.println("Ok");
                        model.setValorEtiqueta(valorEtiqueta);
                        break;
                    }
                }
                try {
                    dados.salvarDados(model);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            case 2:
                //Ler o arquivo                   
                ArrayList<RoupaModel> lista = dados.ListarDados();

                for (RoupaModel m : lista) {
                    System.out.println(m.getCodItem() + " - " + m.getDataEntrada() + " - "
                            + m.getLocalDeCompra() + " - " + m.getTipoRoupa() + " - " + m.getMarcaRoupa()
                            + " - " + m.getCaracteristicasRoupa() + " - " + m.getValorEtiqueta() + " - "
                            + m.getValorCompra() + " - " + m.getPrecoSugerido() + "/n");
                }

                break;

            case 3:
                RoupaModel modelUp = new RoupaModel();
                while (true) {
                    System.out.println("Digite o codigo da compra a ser alterada");
                    int codItem = ler.nextInt();
                    if (!Validacao.validaCodItem(codItem)) {
                        System.out.println("Digite");
                        modelUp.setCodItem(codItem);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o data de entrada a ser alterada");
                    LocalDate dataEntrada = LocalDate.parse(ler.next());
                    if (Validacao.validaDataEntrada(dataEntrada)) {
                        System.out.println("Ok");
                        modelUp.setDataEntrada(dataEntrada);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o local da compra a atualizar");
                    String localDeCompra = ler.next();
                    if (Validacao.validaLocaldeCompra(localDeCompra)) {
                        System.out.println("Ok");
                        modelUp.setLocalDeCompra(localDeCompra);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o tipo da compra a atualizar");
                    String tipoRoupa = ler.next();
                    if (Validacao.validaTipoRoupa(tipoRoupa)) {
                        System.out.println("Ok");
                        modelUp.setTipoRoupa(tipoRoupa);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite a marca de roupa a atualizar");
                    String marcaRoupa = ler.next();
                    if (Validacao.validaMarcaRoupa(marcaRoupa)) {
                        System.out.println("Ok");
                        modelUp.setMarcaRoupa(marcaRoupa);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o valor da compra a atualizar");
                    double valorCompra = ler.nextDouble();
                    if (Validacao.validaValorCompra(valorCompra)) {
                        System.out.println("Ok");
                        modelUp.setValorCompra(valorCompra);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Digite o preço sugerido a atualizar");
                    double precoSugerido = ler.nextDouble();
                    if (Validacao.validaPrecoSugerido(precoSugerido)) {
                        System.out.println("Ok");
                        modelUp.setPrecoSugerido(precoSugerido);
                        break;
                    }
                }

                while (true) {
                    System.out.println("Preço de etiqueta a atualizar");
                    double valorEtiqueta = ler.nextDouble();
                    if (Validacao.validaValorEtiqueta(valorEtiqueta)) {
                        System.out.println("Ok");
                        modelUp.setValorEtiqueta(valorEtiqueta);
                        break;
                    }
                }
                try {
                    dados.atualizarDados(modelUp);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            case 4:
                while (true) {
                    System.out.println("Digite o codigo da compra a remover");
                    int codItem = ler.nextInt();
                    if (!Validacao.validaCodItem(codItem)) {
                        dados.removerDados(codItem);
                        break;
                    }
                    
                    
                }               
                
            case 5:
                System.exit(0);
        }
    }
}
