package pt.ipleiria.estg.esoft.modelo;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Movimento> transactions;

    public Historico() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Movimento transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(Movimento transaction) {
        transactions.remove(transaction);
    }

    public double getBalance() {
        double balance = 0.0;
        for (Movimento t : transactions) {
            if (t.getTipo().equals("CREDITO")) {
                balance += t.getValor();
            } else {
                balance -= t.getValor();
            }
        }
        return balance;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("HISTORICO DE TRANSACOES\n");
        for (Movimento t : transactions) {
            report.append(t.getData() + " | " + t.getDescricao() + " | " + t.getValor() + " | " + t.getTipo() + "\n");
        }
        report.append("Current balance: " + getBalance());
        return report.toString();
    }
}

