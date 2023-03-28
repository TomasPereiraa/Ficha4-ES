package pt.ipleiria.estg.es1.financaspessoais.modelo;
import java.util.ArrayList;

public class GestaoFinancas {
    private Utilizador utilizador;
    
    private ArrayList<Conta> contas;
    private ArrayList<Categoria> categorias;
    
    private static final GestaoFinancas instancia=new GestaoFinancas();
    
    public static GestaoFinancas getGestor() {
        return instancia;
    }
    
    private GestaoFinancas() {
        utilizador=new Utilizador();
        contas=new ArrayList<>();
        categorias=new ArrayList<>();
        
        categorias.add(new Categoria("Alimentação"));
        categorias.add(new Categoria("Alojamento"));
        categorias.add(new Categoria("Diversão"));
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
    
    public void adicionarConta(Conta c) {
        contas.add(c);
    }
    
    public void removerConta(Conta c) {
        contas.remove(c);
    }
    
    public ArrayList<Conta> getContas() {
        return (ArrayList<Conta>)contas.clone();
    }
    
    public void adicionarCategoria(Categoria c) {
        categorias.add(c);
    }
    
    public void removerCategoria(Categoria c) {
        categorias.remove(c);
    }
    
    public ArrayList<Categoria> getCategorias() {
        return (ArrayList<Categoria>)categorias.clone();
    }
}

