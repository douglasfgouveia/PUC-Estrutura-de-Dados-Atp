# Estrutura-de-Dados-Atp
------------------------------------------------------------------------------------------------------------------------------------------------------------------
PONTIFÍCIA UNIVERSIDADE CATÓLICA DO PARANÁ <br />
ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
------------------------------------------------------------------------------------------------------------------------------------------------------------------
ENUNCIADO:
Uma Lista é uma estrutura de dados dinâmica, onde o número de nós de uma lista pode variar consideravelmente à medida que são inseridos e removidos os elementos. Cada elemento de uma lista encadeada (nó) é constituído de dois campos: valor e próximo elemento. Conforme foi apresentado na semana 4 a estrutura de dados, lista, elabore em grupo (não esqueça de se inscrever na semana 3), uma lista dinâmica de números inteiros em Java. A lista deverá possuir um objeto Nó (classe No) e ter os métodos listados abaixo.<br /><br />
boolean vazia()<br />
void inserePrimeiro(int info)<br />
void insereDepois(No no, int info)<br />
void insereUltimo(int info)<br />
No removePrimeiro()<br />
No removeUltimo()<br />
No remove(No no)<br />
void mostrar()<br />

ENTREGA:
Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.
Somente um integrante do grupo deve enviar a atividade com o nome de todos que participaram.
IMPORTANTE! Junto com o arquivo (código fonte), sugerimos enviar um vídeo de no máximo 2 minutos, apresentando/demonstrando o funcionamento do seu trabalho. Ele deverá ser publicado no Youtube como não listado e o link encaminhado junto com a postagem do código fonte. Esse material extra é interessante, pois demonstra o funcionamento do seu código. Porém, o código fonte é obrigatório e ele será avaliado na atividade.<br />
O que será avaliado na atividade:<br />
Nó:<br />  
Deverá possuir uma variável inteira e um objeto do mesmo tipo da classe, além dos métodos de get, set e próximo elemento.<br />
Lista:<br />
Deverá ter um objeto com o endereço do primeiro elemento da lista.<br />
Método vazia: deverá verificar se a lista está vazia ou não.<br />
Método inserePrimeiro: deverá inserir um valor no início da lista.<br />
Método insereDepois: deverá inserir um valor depois de um nó específico da lista, deverá passar este nó como parâmetro na chamada do método.<br />
Método insereUltimo: deverá inserir um valor no fim da lista.<br />
Método removePrimeiro: deverá remover o primeiro nó da lista.<br />
Método removeUltimo: deverá remover o último nó da lista.v
Método remove: deverá remover qualquer nó da lista, deverá passar este nó como parâmetro na chamada do método.<br />
Método mostrar: deverá mostrar no console todos os itens da lista.<br />
