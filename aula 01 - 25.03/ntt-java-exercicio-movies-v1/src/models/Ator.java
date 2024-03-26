package models;

import java.util.List;

public class Ator extends Pessoa{
   private List<String> filmesAtuados;

    public List<String> getFilmesAtuados() {
        return filmesAtuados;
    }

    public void setFilmesAtuados(List<String> filmesAtuados) {
        this.filmesAtuados = filmesAtuados;
    }
}
