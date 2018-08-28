/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 12041789921
 */
public class ControladorAluno {
    
    public static void main(String[] arg){
        List<Aluno> arrayList = new ArrayList<>();
        List<Aluno> linkedList = new LinkedList<>();
        Set<Aluno> hashSet = new HashSet<>();
        Map<String, Aluno> hashMap = new HashMap<>();
        


        Aluno aluno1 = new Aluno("0482");
        Aluno aluno2 = new Aluno("9875");
        Aluno aluno3 = new Aluno("843689");

        arrayList.add(aluno1);
        arrayList.add(aluno2);
        arrayList.add(aluno2);
        arrayList.add(aluno3);
        
        System.out.println("---Imprindo Alunos Array List---");
        for(Aluno aluno : arrayList){
            System.out.println("Aluno: "+aluno.getMatricula());
        }
        
        
        hashSet.add(aluno1);
        hashSet.add(aluno2);
        hashSet.add(aluno2);
        hashSet.add(aluno3);
        
        System.out.println("---Imprindo Alunos Hash Set---");
        for(Aluno aluno : hashSet){
            System.out.println("Aluno: "+aluno.getMatricula());
        }
        
        linkedList.add(aluno1);
        linkedList.add(aluno2);
        linkedList.add(aluno2);
        linkedList.add(aluno3);
        
        System.out.println("---Imprindo Alunos Linked List---");
        for(Aluno aluno : linkedList){
            System.out.println("Aluno: "+aluno.getMatricula());
        }
        
        hashMap.put(aluno1.getMatricula(),aluno1);
        hashMap.put(aluno2.getMatricula(),aluno2);
        hashMap.put(aluno2.getMatricula(),aluno2);
        hashMap.put(aluno3.getMatricula(),aluno3);
        
        System.out.println("---Imprindo Alunos HashMap Values---");
        for(Aluno aluno : hashMap.values()){
            System.out.println("Aluno: "+aluno.getMatricula());
        }
        
        System.out.println("---Imprindo Alunos HashMap Keys---");
        for(String matricula : hashMap.keySet()){
            System.out.println("Aluno: "+matricula);
        }
    }
    
}
