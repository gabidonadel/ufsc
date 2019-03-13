/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.SuperIntArray;
/**
 *
 * @author Dall Agnol
 */
public class SuperIntArray {
    private int min;
    private int max;
    private int[] array;
    
    public SuperIntArray(int min, int max) {
        this.min = (min<max)? min: max;
        this.max = (max>min)? max: min;
        this.array = new int[Math.abs(this.max)-Math.abs(this.min)];
    }

    public int[] getArray() {
        return array;
    }
    
    public int getInt(int index) throws Exception{
        if(index-this.min >= 0){
            return this.array[index-this.min];
        }else{
            Exception e = new Exception("Index Out of Bounds");
            throw e;
        }
    }
    
    public int setInt(int val, int index){
        this.array[index-this.min] = val;
        return this.array[index-this.min];
    }
    

}
