/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.filacircular;

/**
 *
 * @author luizanurnberg
 */
public class Knot {
    public Knot nextKnot;
    public Object data;
    
    public Knot(Object obj){
        this.nextKnot = null;
        this.data = obj;
    }
}
