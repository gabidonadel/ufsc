/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.SuperIntArray;

import java.util.Scanner;

/**
 *
 * @author Dall Agnol
 */
public class Aula1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        SuperIntArray a = new SuperIntArray(8, -3);
        a.setInt(3, -2);
        try{
            System.out.println(a.getInt(-2));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
