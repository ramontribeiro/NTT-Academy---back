package models;

import java.util.Date;

public class Informacoes {
    private String enderecoGravacao;
    private int tempoGravacao;
    private Date dataInicioGravacao;
    private Date dataFinalGravacao;

    public String getEnderecoGravacao() {
        return enderecoGravacao;
    }

    public void setEnderecoGravacao(String enderecoGravacao) {
        this.enderecoGravacao = enderecoGravacao;
    }

    public int getTempoGravacao() {
        return tempoGravacao;
    }

    public void setTempoGravacao(int tempoGravacao) {
        this.tempoGravacao = tempoGravacao;
    }

    public Date getDataInicioGravacao() {
        return dataInicioGravacao;
    }

    public void setDataInicioGravacao(Date dataInicioGravacao) {
        this.dataInicioGravacao = dataInicioGravacao;
    }

    public Date getDataFinalGravacao() {
        return dataFinalGravacao;
    }

    public void setDataFinalGravacao(Date dataFinalGravacao) {
        this.dataFinalGravacao = dataFinalGravacao;
    }
}
