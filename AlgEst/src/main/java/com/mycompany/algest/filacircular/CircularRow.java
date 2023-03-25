/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.filacircular;

/**
 *
 * @author luizanurnberg
 */
public class CircularRow {

    public Knot start;
    public Knot end;

    /*
            Construtor da fila
            - inicio e fim serão iniciados como null.
     */
    public CircularRow() {
        this.start = null;
        this.end = null;
    }

    /*
            Método que valida se a fila está vazia ou não
            - se sim, retorna true
            - se não, retorna false
     */
    public boolean emptyRow() {
        if (start == null && end == null) {
            return true;
        }
        return false;
    }

    /*
            Método para adicionar valores no array
            - Se a fila estiver vazia, ele apenas coloca o fim e o inicio apontados na mesma posição, 
                caso contrário, tem que inserir o novo na ultima posição e alterar o indicador
     */
    public void addObject(Object obj) {
        Knot newKnot = new Knot(obj);

        //Começo e fim recebem o mesmo objeto, apontador do fim recebe o começo
        if (start == null) {
            start = newKnot;
            end = newKnot;
            end.nextKnot = start;
        } else {
            //o novo início receberá o inicío anterior
            newKnot.nextKnot = start;
            //o fim recebe o novo elemento, já que numa fila os elementos entram sempre por trás
            end.nextKnot = newKnot;
            end = newKnot;
        }

    }

    /*
            Método para remover valores no array
     */
    public Object removeObject() {

        Object removed;

        if (emptyRow() || start == end) {
            return null;
        } else {
            //o objeto a ser removido será o dado do primeiro objeto iterado no construtor da classe Knot
            removed = start.data;
            //fim vai receber o início, ou seja, uma posição vazia
            end = start;
            //início receberá o novo início
            start = start.nextKnot;
            end.nextKnot = start;

        }

        return removed;

    }

}
