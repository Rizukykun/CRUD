/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;

import crud.business.*;
import crud.shared.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Fábio
 */
public class CRUDDao {
<<<<<<< HEAD
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       File dados = new File("dados.txt"); 
       FileWriter writer = new FileWriter("dados.txt");
       if (!dados.createNewFile()){
           dados.delete();
           dados.createNewFile();
       }
=======

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
>>>>>>> 4c8e026874a4cb2083ef9ba51f8863f982ab98de
    }
    
}
