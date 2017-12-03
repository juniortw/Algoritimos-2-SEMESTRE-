package br.com.bandtec.estabelecimentosjpa.repository;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.Estabelecimento;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import java.util.List;

public class EstabelecimentoRepository
        extends GenericRepository<Estabelecimento> {

    public EstabelecimentoRepository(Conexao conexao) {
        super(conexao);
    }

    public List<Estabelecimento> recuperarTodos() {
        return this.em.
                createQuery("from Estabelecimento")
                .getResultList();
    }
    
    
    public List<Estabelecimento> recuperarPorNomeContendo(String termo) {
        return this.em.createQuery(
                "from Estabelecimento where nome like ?")
                .setParameter(1, "%"+termo+"%")
                .getResultList();
    }

    @Override
    protected Class getClasse() {
        return Estabelecimento.class;
    }

}
