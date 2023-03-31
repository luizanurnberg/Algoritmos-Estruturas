/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algest;

import com.mycompany.algest.fila.Row;
import com.mycompany.algest.filacircular.CircularRow;
import com.mycompany.algest.lista.List;
import com.mycompany.algest.pilha.Pile;

/**
 *
 * @author luizanurnberg
 */
public class AlgEst {

    public static void main(String[] args) throws Exception {
        
        //PILHA
//        Pile p = new Pile();
//        p.addObject("Luíza Nurnberg");
//        p.addObject("Adrian Grosch");
//        p.addObject("Maria Cecília Holler");
//        p.addObject("André Vigarani");
//        p.addObject(10);
//                while (p.emptyPile() == false) {
//            System.out.println(p.removeObject());
//        }

        //FILA DINÂMICA
//        Row r = new Row();
//        r.addObject("Luíza Nurnberg");
//        r.addObject("Adrian Grosch");
//        r.addObject("Maria Cecília Holler");
//        r.addObject(10);
//            while(r.emptyRow() == false){
//                System.out.println(r.removeObject());
//            }

    

       // FILA DINÂMICA CIRCULAR
//        CircularRow cr = new CircularRow();
//        cr.addObject("Luíza Nurnberg");
//        cr.addObject("Adrian Grosch");
//        cr.addObject("Maria Cecília Holler");
//        cr.addObject(10);
//            //gera loop
//            while(cr.emptyRow() == false){
//                System.out.println(cr.removeObject());
//                
//           }
//
//     
       //LISTA ENCADEADA
       List l = new List();
       l.show(l.euclides(125,75));
      
       
       
   }
}
