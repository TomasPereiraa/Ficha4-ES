package Utilizador;

import java.io.Serializable;

public class Utilizador implements Serializable{
    private String nome;
    private String morada;
    private String email;

    public Utilizador() {
        this("Nome do Utilizador","Morada do Utilizador","Email do Utilizador");
    }

    public Utilizador(String nome, String morada, String email) {
        this.nome = nome;
        this.morada = morada;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





}
