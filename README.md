# Resumo Algoritmos e Estrutura de dados em Java
Conhecimentos adquiridos nas aulas do Professor Carlos

<h2>Complexidade de algoritmos</h2> 

Em uma análise de algoritmo, deve ser considerado o tempo de execução do código e as quantidades de inputs. As análises podem ser classificadas em:

1 - Análise empírica - é realizada a execução  do programa com tamanhos e composições de input variados, porém os resultados podem não ser conclusivos, já que pode ser necessária uma simulação no ambiente de software e hardware do usuário.
 
2 - Análise teórica - caracteriza o desempenho do algoritmo conforme a quantidade de dados que ele precisa analisar, permite avaliar a eficiência de forma independente do ambiente do usuário.

3 - Análise assintótica - verifica a qualidade do algoritmo, porém depende do número de operações realizadas, trabalhando com a pior visão do cenário conforme cresce o número de elementos processados. 

    - O (1) - constante: não há aumento nas operações conforme os dados aumentam (tabela Hash). Lê e escreve sempre na mesma velocidade. 
    - O (log n) - logarítmico: aumenta muito pouco o número de operações para uma grande coleção de dados (buscas binárias e árvores). 
    - O (n) - linear: aumenta linearmente o número de operações com o aumento dos dados (busca em vetor).
    - O (n2) - quadrático: aumento quadrático à medida que aumentam os dados (têm normalmente um for dentro de outro for).
    - O (2n) - exponencial: cresce exponencialmente com o aumento dos dados (algoritmos de busca inocentes).
    - O (n!) - fatorial: tendem a crescer muito com os dados (um algoritmo que gere todas as permutações em uma lista).

<h2>Listas Lineares</h2>
Lista linear é uma estrutura de dados que conecta elementos com características/tipos semelhantes. Em uma lista linear, os dados são organizados de forma que cada elemento mantenha uma ligação com seu antecessor e seu sucessor. Em um Conjunto de N nós, onde N ≥ 0, x1, x2, ..., xn, temos as seguintes afirmações:

- N = null, dizemos que a lista ainda está vazia.

- Se N ≥ 0, então x1 é o primeiro nó.

- Os pŕoximos nós serão seguidos por xk+1.

- xn será o último nó.




<h2>Tipos de Listas Lineares</h2>
Os tipos mais comuns de listas lineares são:

<h3>Pilhas</h3>
Uma pilha é uma lista linear do tipo LIFO - Last In First Out, o último elemento que entrou, é o primeiro a sair. Ela possui apenas uma entrada, chamada de topo, a partir da qual os dados entram e saem dela. 

      - Códido genérico disponível na pasta 'com.mycompany.algest.pilha'
      - Lembrando que o QuickSort recebe uma adaptação do código da Pilha, então para cada caso ele precisa ser adaptado conforme a necessidade

<h3>Filas</h3>
Uma fila é uma lista linear do tipo FIFO - First In First Out, o primeiro elemento a entrar será o primeiro a sair. Na fila os elementos entram por um lado (“por trás”) e saem por outro (“pela frente”). 

      - Códido genérico disponível na pasta 'com.mycompany.algest.fila'

<h3>Deques</h3>
Um deque - Double-Ended QUEue) é uma lista linear na qual os elementos entram e saem tanto pela “pela frente” quanto“por trás”. Pode ser considerada uma generalização da fila.

