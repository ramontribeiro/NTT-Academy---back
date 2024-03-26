package models;

import java.util.List;

public class Diretor extends Pessoa{
    private List<String> filmesDirigidos;

    private List<String> atoresFavoritos;

    public List<String> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(List<String> filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }

    public List<String> getAtoresFavoritos() {
        return atoresFavoritos;
    }

    public void setAtoresFavoritos(List<String> atoresFavoritos) {
        this.atoresFavoritos = atoresFavoritos;
    }
}
