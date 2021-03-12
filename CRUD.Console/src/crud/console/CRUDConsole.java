/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.console;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fábio
 */
public class CRUDConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("1-Cadastrar");
        System.out.println("2-Ler");
        System.out.println("3-Atualizar");
        System.out.println("4-Deletar");
        System.out.println("5-sair");
        
        /*try {
            arquivo.createNewFile();
        }catch(IOException ex){*/
        
        /*}

        do {
            System.out.println("\n" + "Digite um codigo:");
            codigo = teclado.nextLine();*/

        
        int v1=ler.nextInt();
        switch(v1)
            
          
        {
            case 1:
                System.out.println("Digite o local da compra");
                /*string Roupa = s.localDeCompra();*/
                System.out.println("Digite o tipo da compra");
                /*string Roupa = s.tipoRoupa();*/
                System.out.println("Digite a marça da compra");
                /*string Roupa = s.marcaRoupa();*/
                System.out.println("Digite as caracteristicas da compra");
                /*string Roupa = s.caracteristicasRoupa();*/
                System.out.println("Digite o tamanho da compra");
                /*string Roupa = s.tamanhoRoupa();*/
                System.out.println("Digite o valor da compra");
                /*string Roupa = s.valorCompra();*/
            case 2:
                 /*try {
                        //Ler o arquivo

                        FileReader CriarExibir = new FileReader(arquivo);

                        System.out.println("Lista dos nomes:");
                        BufferedReader ler = new BufferedReader(CriarExibir);
                        String exibir = ler.readLine();

                        while(exibir != null) {
                            System.out.println(exibir);
                            exibir = ler.readLine();

                        }

                        }catch (IOException ex) {

                        }

                        break;*/
            case 3:
                System.out.println("C");
            case 4:       
                /*if(arquivo.delete()) {
                            System.out.println("Arquivo Deletado Com sucesso");
                        }

                        break;

                    default:
                        System.out.println("Codigo Invalido!");
                        break;*/
            case 5:
                System.exit(0);
        }
        
        
    }
    
}
