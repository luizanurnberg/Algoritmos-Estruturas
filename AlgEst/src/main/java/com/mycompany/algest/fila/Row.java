/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algest.fila;

/**
 *
 * @author luizanurnberg
 */
public class Row {

    public int start;
    public int end;
    public int size;
    public int numberOfElements;
    public Object row[];

    /*
            Construtor da fila
            - Inicializando começo e fim como vazios
            - Tamanho igual 100 
            - Número de elementos igual a 0
     */
    public Row() {
        this.start = -1;
        this.end = -1;
        this.size = 100;
        this.row = new Object[size];
        this.numberOfElements = 0;
    }

    /*
            Método que valida se a fila está vazia ou não
            - se sim, retorna true
            - se não, retorna false
            * OBS: o método de add poderia ser após o if de validação
     */
    public boolean emptyRow() {
        if (numberOfElements == 0) {
            return true;
        }
        return false;
    }

    /*
            Método para adicionar valores no array
            - Se a fila não estiver vazia, inclui os valores no fim da fila
            - Lembrando que o começo é inicializado em -1 no construtor, ou seja ao executar a linha 53 e depois a 55
              quer dizer que o começo e fim são iguais na primeira iteração de objeto
                START = 0 e END = 0 (END ++, ou seja -1 + a iteração do primeiro objeto)
                *OBS: não usei o método 'emptyRow()' porque nos testes de bug era gerado um problema.
                      - o número de elementos na primeira iteração sempre ia ser 0, ou seja, ao fazer a validação,
                        ia dizer que a fila estava vazia e ao tentar validar o método antes de incluir um novo valor,
                        o valor pulava fora do add
     */
    public void addObject(Object obj) {
        if (start == -1) {
            start = 0;
        }
        end++;
        row[end] = obj;
        numberOfElements++;

    }

    /*
            Método para remover valores no array
            - Se a fila não estiver vazia, remove do inicio da fila 
            - start++ - mostra que o incício será novo
     */
    public Object removeObject() {
        if (emptyRow()) {
            return null;
        } else {
            numberOfElements--;
            return this.row[start++];
        }
    }
}
