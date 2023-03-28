package pt.ipleiria.estg.es1.financaspessoais.modelo;
import java.io.Serializable;
public class Categoria implements Cloneable, Serializable {
    private String nome;
    public Categoria(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}
