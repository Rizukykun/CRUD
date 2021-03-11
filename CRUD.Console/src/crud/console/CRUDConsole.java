/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.console;

import java.util.Scanner;

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
        
        int v1=ler.nextInt();
        switch(v1)
        {
            case 1:
                System.out.println("Digite o local da compra");                
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            case 4:       
                System.out.println("D");            
        }
        
        
    }
    
}
