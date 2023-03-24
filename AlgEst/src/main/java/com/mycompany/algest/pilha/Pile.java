/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.pilha;

/**
 *
 * @author luizanurnberg
 */
public class Pile {

    /* Criado o array com um tipo genérico de Objeto, o qual pode ser substituído conforme a necessidade */
    public Object pile[];
    private int top;

    /* Construtor da classe
        - Criará um array com o tamanho definido
        - Variável inicializada em -1 para mostrar que o topo ainda está vazio 
     */
    public Pile() {
        this.top = -1;
        this.pile = new Object[1000];
    }

    /* Método para validar se a pilha está vazia ou não
        - retorno true: está vazia
        - retorno false: está preenchida, mesmo que com apenas uma posição
     */
    public boolean emptyPile() {
        if (this.top == -1) {
            return true;
        }
        return false;
    }

    /* Método para retornar o tamanho da pilha
        - se a pilha estiver vazia, retornará 0
        - se estiver preenchida, é acrescentado um ao tamanho do top (pois ele é iniciado em -1)
     */
    public int getPileSize() {
        if (this.emptyPile()) {
            return 0;
        }
        return this.top + 1;
    }

    /* Método para empilhar novos valores
     */
    public void addObject(Object obj) throws Exception {
        if(this.top < this.pile.length -1){
            this.pile[++top] = obj;
        } else{
            throw new Exception("Você não pode inserir mais objetos dentro desse Array");
        }
    }

    /* Método para desempilhar valores
        - Verifica primeiro se o array não está vazio
        - Se não, retira o valor da posição
     */
    public Object removeObject() {
        if (emptyPile()) {
            return null;
        } else {
            return this.pile[this.top--];
        }
    }
 

}
