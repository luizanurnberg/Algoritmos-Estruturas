/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algest;

import com.mycompany.algest.pilha.Pile;

/**
 *
 * @author luizanurnberg
 */
public class AlgEst {

    public static void main(String[] args) throws Exception {
        
        Pile p = new Pile();
        p.addObject("Luíza Nurnberg");
        p.addObject("Adrian Grosch");
        p.addObject("Maria Cecília Holler");
        p.addObject("André Vigarani");
        p.addObject(10);
                while (p.emptyPile() == false) {
            System.out.println(p.removeObject());
        }
        
    
    }
}
