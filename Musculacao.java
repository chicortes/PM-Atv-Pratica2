package pm_prova2;

public class Musculacao extends Atividade {
    private int quantidadeAparelhosDisponiveis;

    public Musculacao (String nome,int duracaoAula,int quantidadeMaximaParticipantes,double valorMensal, StatusAtividade status, int quantidadeAparelhosDisponiveis){
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeAparelhosDisponiveis = quantidadeAparelhosDisponiveis;
    }

    @Override
    public boolean atividadeColetiva() {
        return false;
    }
}
