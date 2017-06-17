package com.example.vivian.gerenciador.classes;

public class Mesa {

    private int iId;
    private int iQtdPessoas;
    private String sMesa;

    public Mesa(String sMesa) {
        this.sMesa = sMesa;
    }

    public Mesa(String sMesa, int iId, int iQtdPessoas) {
        this.sMesa = sMesa;
        this.iId = iId;
        this.iQtdPessoas = iQtdPessoas;
    }

    public String getsMesa() {
        return sMesa;
    }

    public void setsMesa(String sMesa) {
        this.sMesa = sMesa;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public int getiQtdPessoas() {
        return iQtdPessoas;
    }

    public void setiQtdPessoas(int iQtdPessoas) {
        this.iQtdPessoas = iQtdPessoas;
    }
}

