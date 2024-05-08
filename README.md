# Estrutura de Dados em Java

Repositório dedicado ao armazenamento de modificações em código estruturado feitas no curso de ciência da computação pela FAESA.

## ESTRUTURAS DE DADOS VISTAS E PRATICADAS:

### Lista Simplesmente Encadeada

- Uma estrutura de dados na qual cada elemento, chamado de nó, contém um valor e uma referência ao próximo nó na lista.
- Os nós são encadeados de forma sequencial, e o último nó tem uma referência nula.
- A inserção e a remoção de elementos podem ser eficientes no início da lista, mas menos eficientes no final, pois pode ser necessário percorrer a lista até o último nó.

### Lista Duplamente Encadeada

- Similar à lista simplesmente encadeada, mas cada nó contém também uma referência ao nó anterior, além do próximo nó.
- Isso permite navegar pela lista em ambas as direções, facilitando operações como inserção e remoção em qualquer posição.
- No entanto, essa estrutura de dados requer mais espaço de armazenamento devido às referências adicionais em cada nó.

### Fila Circular

- Uma estrutura de dados na qual os elementos são organizados em uma ordem específica, onde o primeiro elemento inserido é o primeiro a ser removido (FIFO - First In, First Out).
- Na fila circular, a inserção ocorre no final da fila, e a remoção ocorre no início da fila, mas a estrutura é circular, ou seja, após atingir o final da fila, os elementos continuam 
  sendo inseridos no início, se houver espaço disponível.
- Isso permite um uso eficiente do espaço de armazenamento e é útil em situações onde os elementos precisam ser processados em uma ordem específica.

### Pilha

- Uma estrutura de dados na qual os elementos são organizados em uma ordem específica, onde o último elemento inserido é o primeiro a ser removido (LIFO - Last In, First Out).
- Na pilha, a inserção ocorre no topo da pilha, e a remoção também ocorre no topo da pilha.
- As operações mais comuns em uma pilha são "push" para adicionar um elemento ao topo da pilha e "pop" para remover o elemento do topo da pilha.
- Pilhas são úteis em situações onde a ordem de processamento é reversa à ordem de chegada dos elementos, como na avaliação de expressões aritméticas ou no rastreamento de chamadas de 
  função em um programa.

