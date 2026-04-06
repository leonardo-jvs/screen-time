package service;
import model.Aplicativo;
import java.util.List;

public class Relatorio {

    public int calcTempoTotal(List<Aplicativo> listaApps) {
        int tempoTotal = 0;
        for (Aplicativo app : listaApps) {
            tempoTotal += app.getTempo();
        }
        return tempoTotal;
    }
    public Aplicativo appMaisUsado(List<Aplicativo> listaApps) {
        if (listaApps.isEmpty()) return null;
        Aplicativo maisUsado = listaApps.get(0);
        for (Aplicativo app : listaApps) {
            if (app.getTempo() > maisUsado.getTempo()) {
                maisUsado = app;
            }
        }
        return maisUsado;
    }
    public void exibirRelatorio(List<Aplicativo> listaApps) {
        System.out.println("\n RELATÓRIO DE USO");

        int tempoTotal = calcTempoTotal(listaApps);
        System.out.println("Tempo total: " + tempoTotal + " min");
        Aplicativo appTop = appMaisUsado(listaApps);
        if (appTop != null) {
            System.out.println("App mais usado: "
                    + appTop.getNome() + " - "
                    + appTop.getTempo() + " min");
        }
        System.out.println("\nLista de apps:");
        for (Aplicativo app : listaApps) {
            System.out.println(app.getNome() + " - " + app.getTempo() + " min");
        }
    }
}
