package pt.ipleiria.estg.es1.financaspessoais.modelo;
import java.io.Serializable;
import java.util.ArrayList;

public class Conta implements Cloneable, Serializable {
    private TipoConta tipo;
    private String nome;
    private double saldo;
    private ArrayList<Movimento> movimentos;
    public Conta(TipoConta tipo, String nome, double saldo) {
        this.tipo = tipo;
        this.nome = nome;
        this.saldo = saldo;
        movimentos=new ArrayList<>();
    }
    public TipoConta getTipo() {
        return tipo;
    }
    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldoInicial(double saldo) {
        if (movimentos.size()>0)
            throw new RuntimeException("Não se pode actualizar o saldo quando existem movimentos.");
        this.saldo=saldo;
    }
    public void adicionarMovimento(Movimento mov) {
        movimentos.add(mov);
        if (mov.getTipo()==TipoMovimento.CREDITO)
            saldo+=mov.getValor();
        else
            saldo-=mov.getValor();
    }
    public ArrayList<Movimento> getMovimentos() {
        return (ArrayList<Movimento>)movimentos.clone();
    }
    @Override
    public String toString() {
        return nome+" ("+tipo.toString()+") - "+saldo;
    }
    public void removerMovimento(Movimento mov) {
        if (movimentos.remove(mov)) {
            if (mov.getTipo()==TipoMovimento.CREDITO)
                saldo-=mov.getValor();
            else
                saldo+=mov.getValor();
        }
    }
    public void actualizarSaldo(Movimento antigo, Movimento novo) {
        if (antigo.getTipo()==TipoMovimento.CREDITO)
            saldo-=antigo.getValor();
        else
            saldo+=antigo.getValor();
        if (novo.getTipo()==TipoMovimento.CREDITO)
            saldo+=novo.getValor();
        else
            saldo-=novo.getValor();
    }
}
