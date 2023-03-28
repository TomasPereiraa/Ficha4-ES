package pt.ipleiria.estg.es1.financaspessoais.modelo;
import java.io.Serializable;
public class Movimento implements Cloneable, Serializable {
    private TipoMovimento tipo;
    private String descricao;
    private Data data;
    private double valor;
    private Categoria categoria;

    public Movimento(String descricao, Data data, double valor, TipoMovimento tipo, Categoria categoria) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.categoria = categoria;
        this.tipo=tipo;
    }
    public Movimento(String descricao, double valor, TipoMovimento tipo) {
        this(descricao, new Data(), valor, tipo, null);
    }
    public String getDescricao() {
        return descricao;
    }
    public Data getData() {
        return data;
    }
    public double getValor() {
        return valor;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public TipoMovimento getTipo() {
        return tipo;
    }
    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return data.toString()+" - "+descricao+" ["+tipo.toString()+"] "+Double.toString(valor);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}