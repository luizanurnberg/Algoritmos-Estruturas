/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.lista;

import java.util.Scanner;

/**
 *
 * @author luizanurnberg
 */
public class Multi {

    Scanner s = new Scanner(System.in);
    static Knot start;

    public Multi() {
        this.start = null;
    }

    public void addList() {
        System.out.println("INFORME O DIVIDENDO");
        int dividend = s.nextInt();
        System.out.println("INFORME O DIVISOR");
        int divisor = s.nextInt();

        if (start == null) {
            start = new Knot();
            start.de = new List(dividend, divisor);
        } else {
            Knot newKnot = new Knot();
            newKnot.de = new List(dividend, divisor);
            Knot aux = start;
            while (aux.nextKnot != null) {
                aux = aux.nextKnot;
            }
            aux.nextKnot = newKnot;
            newKnot.previousKnot = aux;
        }
    }

    public void showList() {
        Knot aux = start;
        while (aux.nextKnot != null) {
            aux.de.show(aux.de.start());
            System.out.println("");
            aux = aux.nextKnot;
        }
        aux.de.show(aux.de.start());
    }
}
