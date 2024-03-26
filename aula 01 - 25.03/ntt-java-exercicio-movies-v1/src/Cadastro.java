import models.Ator;
import models.Diretor;
import models.Filme;
import models.Informacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws ParseException {
        System.out.println("Bem Vindo ao Cadastro de Filmes");

        Scanner ler = new Scanner(System.in);

        Filme filme = createFilme(ler);

        System.out.println("Filme: " + filme.getNomeFilme());
        System.out.println("Diretor: " + filme.getDiretor().getNome());
        System.out.println("Elenco: " + filme.getElenco().get(0).getNome());
        System.out.println("Endereço de Gravação: " + filme.getDados().getEnderecoGravacao());
        System.out.println("Tempo de Gravação: " + filme.getDados().getTempoGravacao());
        System.out.println("Data Início de Gravação: " + filme.getDados().getDataInicioGravacao());
        System.out.println("Data Término de Gravação: " + filme.getDados().getDataFinalGravacao());
    }

    private static Filme createFilme(Scanner ler) throws ParseException {

        Filme filme = new Filme();

        System.out.println("Qual é o nome do filme?");
        filme.setNomeFilme(ler.next());

        filme.setDiretor(createDiretor(ler));

        List<Ator> atores = new ArrayList<>();

        atores.add(createActor(ler));
        filme.setElenco(atores);

        filme.setDados(createDados(ler));
        return filme;
    }

    private static Informacoes createDados(Scanner ler) throws ParseException {
        Informacoes informacoes = new Informacoes();

        System.out.println("Qual é o endereço de gravação?");
        informacoes.setEnderecoGravacao(ler.next());

        System.out.println("Qual é o tempo de gravação?");
        informacoes.setTempoGravacao(ler.nextInt());

        System.out.println("Qual é a data de início de gravação? (dd/mm/yyyy)");
        String dateStr = ler.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        informacoes.setDataInicioGravacao(sdf.parse(dateStr));

        System.out.println("Qual é a data de término da gravação? (dd/mm/yyyy)");
        String dateStrF = ler.next();
        SimpleDateFormat sdfF = new SimpleDateFormat("dd/MM/yyyy");
        informacoes.setDataInicioGravacao(sdfF.parse(dateStrF));

        return informacoes;
    }

    private static Diretor createDiretor(Scanner ler){
        Diretor diretor = new Diretor();

        System.out.println("Qual é o nome do diretor?");
        diretor.setNome(ler.next());

        return diretor;
    }

    private static Ator createActor(Scanner ler){
        Ator ator = new Ator();

        System.out.println("Qual é o nome do ator/atriz?");
        ator.setNome(ler.next());

        return ator;
    }
}
