package br.com.bandtec.estabelecimentosjpa.app;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.Estabelecimento;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import br.com.bandtec.estabelecimentosjpa.repository.EstabelecimentoRepository;
import br.com.bandtec.estabelecimentosjpa.repository.TipoEstabelecimentoRepository;
import br.com.bandtec.estabelecimentosjpa.utils.IOUtils;
import java.util.List;

public class MenuPrincipal {

    private final static String MENSAGEM_MENU
            = "Estabelecimentos APP - Tela inicial\n"
            + "1 - Cadastrar Tipo de Estabelecimento\n"
            + "2 - Listar todos os Tipos de Estabelecimento\n"
            + "3 - Pesquisar Tipo de Estabelecimento\n"
            + "4 - Excluir Tipo de Estabelecimento\n"
            + "5 - Atualizar Tipo de Estabelecimento\n"
            + "6 - Cadastrar Estabelecimento\n"
            + "7 - Ver um Estabelecimento\n"
            + "8 - Listar todos os Estabelecimentos\n"
            + "9 - Pesquisar Estabelecimento\n"
            + "10 - Excluir Estabelecimento\n"
            + "NDA - Sair";

    public static void executar() {
        menu:
        while (true) {

            int escolha = IOUtils.lerInt(MENSAGEM_MENU);

            Conexao conexao = new Conexao();
            TipoEstabelecimentoRepository repository
                    = new TipoEstabelecimentoRepository(conexao);

            EstabelecimentoRepository repository2
                    = new EstabelecimentoRepository(conexao);

            switch (escolha) {
                case 1:
                    TipoEstabelecimento registro = new TipoEstabelecimento();

                    registro.setNome(
                            IOUtils.lerString("Nome do tipo de estabelecimento"));

                    repository.salvar(registro);

                    break;

                case 2:

                    for (TipoEstabelecimento registro2 : repository.recuperarTodos()) {
                        System.out.println(registro2);
                        System.out.println(
                                repository.
                                        getRelatorioEstabelecimentos(registro2));
                    }

                    break;
                case 3:

                    String pesquisa = IOUtils.lerString("Pesquisa");

                    List<TipoEstabelecimento> resultado
                            = repository.recuperarPorNomeContendo(pesquisa);

                    System.out.println("Registros da pesquisa:");
                    for (TipoEstabelecimento registro3 : resultado) {
                        System.out.println(registro3);
                    }

                    break;

                case 4:
                    long idExcluir
                            = IOUtils.lerInt("Código p/ excluir");

                    repository.excluir(idExcluir);
                    break;

                case 5:
                    long idAtualizar
                            = IOUtils.lerInt("Código p/ atualizar");

                    TipoEstabelecimento recuperado
                            = repository.recuperar(idAtualizar);

                    recuperado.setNome(IOUtils.lerString("Qual o novo nome"));

                    break;

                case 6:
                    Estabelecimento novoEstabelecimento
                            = new Estabelecimento();

                    novoEstabelecimento.setNome(
                            IOUtils.lerString("Nome do estabelecimento"));

                    TipoEstabelecimento tipo = new TipoEstabelecimento();
                    long idTipo
                            = IOUtils.lerInt("Qual o tipo de estabelecimento");
                    tipo.setId(idTipo);

                    novoEstabelecimento.setTipo(tipo);

                    repository2.salvar(novoEstabelecimento);
                    break;

                case 7:
                    long id = IOUtils.lerInt("Qual o estabelecimento");

                    Estabelecimento estabelecimento
                            = repository2.recuperar(id);

                    System.out.println(estabelecimento);

                    break;

                case 8:

                    for (Estabelecimento registro3 : repository2.recuperarTodos()) {
                        System.out.println(registro3);
                    }

                    break;

                case 9:

                    String pesquisa2 = IOUtils.lerString("Pesquisa");

                    List<Estabelecimento> resultado2
                            = repository2.recuperarPorNomeContendo(pesquisa2);

                    System.out.println("Registros da pesquisa:");
                    
                    for (Estabelecimento registro3 : resultado2) {
                        System.out.println(registro3);
                    }

                    break;
                
                case 10:
                    long idExcluir2
                            = IOUtils.lerInt("Código p/ excluir");

                    repository.excluir(idExcluir2);
                    break;
                    
                default:
                    conexao.comitarFechar();
                    break menu;
            }
            conexao.comitarFechar();
        }
    }

}
