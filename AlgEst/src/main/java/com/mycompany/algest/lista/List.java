/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.lista;

/**
 *
 * @author luizanurnberg
 */
public class List {

    private int divisor;
    private int dividend;

    /* Construtor para o algoritmo da divisao euclidiana */
    public List() {
        this.divisor = divisor;
        this.dividend = dividend;
    }

    public Knot euclides(int divisor, int dividend) {
        Knot head = new Knot();
        head.dividend = dividend;
        head.divisor = divisor;
        head.nextKnot = null;
        Knot aux = head;

        while ((dividend % divisor) != 0) {
            int remnant = dividend % divisor;

            Knot newKn = new Knot();
            newKn.dividend = aux.divisor;
            newKn.divisor = remnant;
            newKn.nextKnot = aux;
            aux.nextKnot = newKn;
            aux = newKn;

            dividend = newKn.dividend;
            divisor = newKn.divisor;
        }

        return head;
    }

    // Imprime a sequ�ncia de divis�es gerada pelo algor�tmo
    public void show(Knot head) {
        Knot aux = head;
        String msg = "";

        while (aux.nextKnot != null) {
            msg += "[" + aux.dividend + "," + aux.divisor + "] ";
            aux = aux.nextKnot;
        }
        msg += "[" + aux.dividend + "," + aux.divisor + "] ";
        System.out.println("MDC: " + aux.divisor);
        System.out.println(msg);

    }

    public Knot start() {
        return euclides(dividend, divisor);
    }
}
