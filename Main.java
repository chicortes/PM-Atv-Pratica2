import java.util.Scanner;

import pm_prova2.Musculacao;
import pm_prova2.Natacao;
import pm_prova2.PlanoBasico;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        carregarDadosIniciais(sistema);
        Scanner sc = new Scanner(System.in);
        try {
            menu(sistema, sc);
        } finally {
            sc.close();
        }
    }

    private static void carregarDadosIniciais(Sistema s) {
        s.cadastrarAtividade(new Natacao("Luis", "8 horas", 10));
        s.cadastrarAtividade(new Musculacao("Marcio", "8 horas", 1));
        s.cadastrarAtividade(new Spinning("Mario", "8 horas", 10));
        s.cadastrarPlano(new PlanoBasico("Chico"));
        s.cadastrarPlano(new PlanoPremium("Leonardo"));
    }
}