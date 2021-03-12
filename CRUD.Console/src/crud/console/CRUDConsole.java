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
import crud.business.Validacao;

/**
 *
 * @author Fábio
 */
public class CRUDConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                

        Scanner ler = new Scanner(System.in);
        File arquivo = new File("Produto.txt"); // cria uma .txt no workspace

        System.out.println("1-Cadastrar");
        System.out.println("2-Ler");
        System.out.println("3-Atualizar");
        System.out.println("4-Deletar");
        System.out.println("5-sair");

        try {
            arquivo.createNewFile();
        } catch (Exception e) {

        }

            System.out.println("\n" + "Digite um codigo:");
            int v1 = ler.nextInt();
            switch (v1) {
                case 1:
                    System.out.println("Digite o local da compra");
                    Scanner localDeCompra = new Scanner(System.in);
                    System.out.println("Digite o tipo da compra");
                    Scanner tipoRoupa = new Scanner(System.in);
                    System.out.println("Digite a marça da compra");
                    Scanner marcaRoupa = new Scanner(System.in);
                    System.out.println("Digite as caracteristicas da compra");
                    Scanner caracteristicasRoupa = new Scanner(System.in);
                    System.out.println("Digite o tamanho da compra");
                    Scanner tamanhoRoupa = new Scanner(System.in);
                    System.out.println("Digite o valor da compra");
                    Scanner valorCompra = new Scanner(System.in);
                case 2:
                    try {
                        //Ler o arquivo

                        FileReader CriarExibir = new FileReader(arquivo);

                        System.out.println("Lista dos nomes:");
                        BufferedReader read = new BufferedReader(CriarExibir);
                        String exibir = read.readLine();

                        while (exibir != null) {
                            System.out.println(exibir);
                            /*exibir = ler.readLine();*/
                        }

                    } catch (Exception e) {

                    }
                    break;
                case 3:
                    System.out.println("C");
                case 4:
                    if (arquivo.delete()) {
                        System.out.println("Arquivo Deletado Com sucesso");
                    }

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Codigo Invalido!");
                    break;
        }
    }
    
}
