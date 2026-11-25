package pm_prova2;

public class Natacao extends Atividade implements Certificavel, ControladorPresenca{
    private int profundidade;

    public Natacao(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int profundidade){
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.profundidade = profundidade;
    }
    
    @Override
    public void emitirCertificado(String nome){
    };

    @Override
    public void registrarPresenca(String nome){
    };

    @Override
    public boolean atividadeColetiva() {
        return false;
    }
}
