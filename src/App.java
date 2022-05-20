/*
Pontifícia Universidade Católica do Paraná

Tecnologia em Análise e Desenvolvimento de Sistemas

Métodos de Pesquisa e Ordenação em Estruturas de Dados

Professor Fellipe Medeiros Veiga

Alunos: Douglas Gouveia
        Fabio Dutra de Almeida
        Mateus Vinicius Franco Agre
*/
public class App {
    public static void main(String[] args) throws ListaVaziaException {
    	No no;
        Lista l = new Lista();
        l.toString();
        l.insereUltimo(12);
        l.insereUltimo(103);
        l.insereUltimo(1040);
        l.inserePrimeiro(29);
        l.mostrar();
        System.out.println("-------------------------------------------------------");
        
        l.removePrimeiro();
        l.removeUltimo();
        l.mostrar();
        System.out.println("-------------------------------------------------------");
        
        no = l.buscar(103);
        if (no != null) {
        	l.remove(no);
        }
        l.mostrar();
        System.out.println("-------------------------------------------------------");
        
        no = l.buscar(12);
        if (no!=null) {
        	l.insereDepois(no, 289);
        }
        l.mostrar();
        System.out.println("-------------------------------------------------------");
        }
    }
