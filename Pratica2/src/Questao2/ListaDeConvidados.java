package Questao2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaDeConvidados {
    public static void main(String[] args) {
        LinkedList<String> listaNoiva = new LinkedList<>();
        LinkedList<String> listaNoivo = new LinkedList<>();


        listaNoiva.add("Ana");
        listaNoiva.add("Beatriz");
        listaNoiva.add("Carla");
        listaNoiva.add("Daniela");
        listaNoiva.add("Eduarda");
        listaNoiva.add("Fernanda");
        listaNoiva.add("Gabriela");
        listaNoiva.add("Elena");
        listaNoiva.add("Isabela");
        listaNoiva.add("Juliana");
        listaNoiva.add("Larissa");
        listaNoiva.add("Mariana");
        listaNoiva.add("Natália");
        listaNoiva.add("Olívia");
        listaNoiva.add("Patrícia");
        listaNoiva.add("Raquel");
        listaNoiva.add("Sofia");
        listaNoiva.add("Tatiana");
        listaNoiva.add("Vanessa");
        listaNoiva.add("Ximena");
        listaNoiva.add("Yasmin");
        listaNoiva.add("Zara");
        listaNoiva.add("Wagner");
        listaNoiva.add("Vinícius");
        listaNoiva.add("Yago");
        listaNoiva.add("Ulisses");
        listaNoiva.add("Theo");
        listaNoiva.add("Sandro");
        listaNoiva.add("Ricardo");
        listaNoiva.add("Quiteria");
        listaNoiva.add("Pedro");
        listaNoiva.add("Onofre");
        listaNoiva.add("Nina");
        listaNoiva.add("Maria");
        listaNoiva.add("Lorena");
        listaNoiva.add("Kátia");
        listaNoiva.add("Júlio");
        listaNoiva.add("Ingrid");
        listaNoiva.add("Cleissiene");
        listaNoiva.add("Gustavo");
        listaNoiva.add("Flávia");
        listaNoiva.add("Érica");
        listaNoiva.add("Débora");
        listaNoiva.add("Carolina");
        listaNoiva.add("Bruno");
        listaNoiva.add("Bianca");
        listaNoiva.add("Arthur");
        listaNoiva.add("André");
        listaNoiva.add("Amanda");
        listaNoiva.add("Alex");
        listaNoiva.add("Adriana");



        listaNoivo.add("João");
        listaNoivo.add("Lucas");
        listaNoivo.add("Marcos");
        listaNoivo.add("Rafael");
        listaNoivo.add("Diego");
        listaNoivo.add("Felipe");
        listaNoivo.add("Fernando");
        listaNoivo.add("Gustavo");
        listaNoivo.add("Henrique");
        listaNoivo.add("Igor");
        listaNoivo.add("Jorge");
        listaNoivo.add("Leandro");
        listaNoivo.add("Mateus");
        listaNoivo.add("Nelson");
        listaNoivo.add("Otávio");
        listaNoivo.add("Paulo");
        listaNoivo.add("Raul");
        listaNoivo.add("Samuel");
        listaNoivo.add("Thiago");
        listaNoivo.add("Ubirajara");
        listaNoivo.add("Victor");
        listaNoivo.add("Wesley");
        listaNoivo.add("Xavier");
        listaNoivo.add("Yuri");
        listaNoivo.add("Zélio");
        listaNoivo.add("William");
        listaNoivo.add("Valter");
        listaNoivo.add("Ulisses");
        listaNoivo.add("Túlio");
        listaNoivo.add("Sérgio");
        listaNoivo.add("Ricardo");
        listaNoivo.add("Pedro");
        listaNoivo.add("Otto");
        listaNoivo.add("Nilton");
        listaNoivo.add("Maurício");
        listaNoivo.add("Luis");
        listaNoivo.add("Kleber");
        listaNoivo.add("Júlio");
        listaNoivo.add("Ivan");
        listaNoivo.add("Hugo");
        listaNoivo.add("Geraldo");
        listaNoivo.add("Fábio");
        listaNoivo.add("Eduardo");
        listaNoivo.add("Dante");
        listaNoivo.add("Cristiano");
        listaNoivo.add("Bruno");
        listaNoivo.add("André");
        listaNoivo.add("Alex");
        listaNoivo.add("Adriano");


        LinkedList<String> listaCasamento = new LinkedList<>(listaNoiva); //aqui cria um objeto chamado "ListaCasamento" e atribuo a lista da noiva a esse objeto.
        listaCasamento.addAll(listaNoivo); // Em seguida eu adiciona all(todos) os convidados da lista do noivo à esta nova lista

        // Ordene a lista de convidados por ordem alfabética
        Collections.sort(listaCasamento);

        // Imprima os convidados por ordem alfabética
        System.out.println("Lista de Convidados em ordem alfabética:");
        for (String convidado : listaCasamento) {
            System.out.println(convidado);
        }
    }
}