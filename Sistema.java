import java.util.*;

import pm_prova2.Atividade;
import pm_prova2.Plano;
import pm_prova2.StatusAtividade;
import pm_prova2.StatusPlano;

public class Sistema {
    private List<Plano> planos = new ArrayList<>();
    private List<Atividade> atividades = new ArrayList<>();

    public void cadastrarPlano(Plano p) { 
        planos.add(p); 
    }
    public void cadastrarAtividade(Atividade a) { 
        atividades.add(a); 
    }

    public Atividades buscarAtividade (String nome) {
        for (Atividade a : atividades) {
            if (a.getNome().equalsIgnoreCase(nome)) return a;
        }
        return null;
    }

    public Planos buscarPlano(String nome) {
        for (Planos p : planos) {
            if (p.getNome().equalsIgnoreCase(nome)) return p;
        }
        return null;
    }

    public void associarAtividade(String nome) {
        Atividade a = buscarAtividade(nome);
        Plano p = buscarPlano(nome);
        if (a == null || v == null) {
            throw new IllegalArgumentException("Atividade ou Plano Invalido");
        }
        if (a.getStatus() != StatusAtividade.ATIVA) {
            throw new IllegalStateException("Atividade Indisponivel");
        }
        p.adicionarAtividade(a);

        if(a.getQuantidadeMaximaParticipantes())
            a.setStatus(StatusAtividade.LOTADA);
    }

    public void exibirAtividades() {
        if (atividades.isEmpty()) { System.out.println("Nenhuma atividade cadastrada."); return; }
        for (Atividade a : atividades) System.out.println(a);
    }

    public void exibirPlano() {
        if (planos.isEmpty()) { System.out.println("Nenhuma plano cadastrado."); return; }
        for (Plano p : planos) System.out.println(p);
    }

    public void exibirAtivos() {
        for (Plano p : planos) {
            if (p.getStatus() == StatusPlano.ATIVO) System.out.println(p);
        }
    }

    public void certificadoConclusao(String nome) {
        Object alvo = buscarAtividade(nome);
        if (alvo == null) alvo = buscarPlano(nome);

        if (alvo instanceof Certificavel) {
            ((Certificavel) alvo).emitirCertificado(nome);
        } else {
            throw new IllegalArgumentException("Não Certificavel");
        }
    }

    public void presenca(String nome) {
        int frequencia = 0;
        Object alvo = buscarAtividade(nome);
        if (alvo == null) alvo = buscarPlano(nome);

        if (alvo instanceof ControladorPresenca) {
            ((ControladorPresenca) alvo).registrarPresenca(nome);
            frequencia++;
        } else {
            throw new IllegalArgumentException("Atividade sem Presença");
        }
    }

    public int removerInativos() {
        int removidos = 0;
        Iterator<Atividade> it = atividades.iterator();
        while (it.hasNext()) {
            if (it.next().getStatus() == StatusAtividade.INATIVA) {
                it.remove();
                removidos++;
            }
        }
        return removidos;
    }
}