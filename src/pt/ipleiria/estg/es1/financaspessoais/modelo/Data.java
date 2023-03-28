package pt.ipleiria.estg.es1.financaspessoais.modelo;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Data implements Cloneable, Serializable{
    private int dia, mes, ano;

    public Data() {
        Calendar cal=new GregorianCalendar();
        this.dia=cal.get(Calendar.DAY_OF_MONTH);
        this.mes=cal.get(Calendar.MONTH);
        this.ano=cal.get(Calendar.YEAR);
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    
    
}
