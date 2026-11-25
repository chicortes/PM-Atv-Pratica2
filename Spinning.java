import pm_prova2.Atividade;
import pm_prova2.StatusAtividade;

public class Spinning extends Atividade implements ControladorPresenca{
    private int quantidadeBicicletas;

    public Spinning(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int quantidadeBicicletas){
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeBicicletas = quantidadeBicicletas;
    }

    @Override
    public void registrarPresenca(String nomeParticipante);

    @Override
    public boolean atividadeColetiva() {
        return true;
    }
}
