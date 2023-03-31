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

    private int divisor = 0;
    private int dividend = 0;

    /* Construtor para o algoritmo da divisao euclidiana */
    public List(int dividend, int divisor) {
        this.divisor = divisor;
        this.dividend = dividend;
    }

    public Knot euclides(int dividend, int divisor) {
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
            newKn.previousKnot = aux;
            aux.nextKnot = newKn;
            aux = newKn;

            dividend = newKn.dividend;
            divisor = newKn.divisor;
        }

        return head;
    }

    // Imprime a sequencia gerada pelo algoritmo
    public void show(Knot head) {
        String msg = "";

        while (head.nextKnot != null) {
            msg += "[" + head.dividend + "," + head.divisor + "] ";
            head = head.nextKnot;
        }
        msg += "[" + head.dividend + "," + head.divisor + "] ";
        System.out.println("MDC: " + head.divisor);
        System.out.println(msg);

    }

    public Knot start() {
        return euclides(dividend, divisor);
    }
}
