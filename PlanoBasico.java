package pm_prova2;

public class PlanoBasico extends Plano implements ControladorPresenca {
    public static int ACESSOS_PERMITIDOS = 1;

    public PlanoBasico(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status){
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
    }

    public boolean permiteAtividadeColetiva() {
        return false;
    }

    public int getLimiteAcessoDia(){
        return ACESSOS_PERMITIDOS;
    }

    public void registrarPresenca(String nome){
    };

    @Override
    public void exibirDetalhes() {
    }
}
