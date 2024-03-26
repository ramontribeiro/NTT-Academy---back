package models;
import java.util.List;
public class Filme extends Informacoes {
    private String nomeFilme;
    private Diretor diretor;
    private List<Ator> elenco;

    private Informacoes dados;

    public Informacoes getDados() {
        return dados;
    }

    public void setDados(Informacoes dados) {
        this.dados = dados;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    private String genero;


    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }


    public List<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(List<Ator> elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
