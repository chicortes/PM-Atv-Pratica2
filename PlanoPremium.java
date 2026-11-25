import pm_prova2.Plano;
import pm_prova2.StatusPlano;

public class PlanoPremium extends Plano{

    public PlanoPremium(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status){
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
    }

    @Override
    public boolean permiteAtividadeColetiva() {
        return true;
    }

    @Override
    public void exibirDetalhes() {
    }
}

