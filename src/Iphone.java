public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    String musicaSelecionada = null;
    Boolean tocandoMusica = false;
    Boolean emLigacao = false;

    @Override
    public String ligar(String num) {
        if (!emLigacao) {
            return String.format("Ligando para %s", num);
        } else {
            return String.format("Iphone em ligacao para %s", num);
        }
    }

    @Override
    public String atenderLigacao(String num) {
        if (emLigacao) {
            return "Telefone ja em ligacao";
        } else {
            return String.format("Atendendo ligacao de %s", num);
        }
    }

    @Override
    public String iniciarCorreioDeVoz(String msg, String num) {
        if (emLigacao) {
            return "Telefone ja em ligacao";
        } else {
            return String.format("Envinado a mensagem %s para %s",msg, num);
        }
    }

    @Override
    public String exibirPagina(String url) {
        return String.format("Exibindo %s",url);
    }

    @Override
    public String adicionarNovaAba(String url) {
        return String.format("Adicionando aba %s",url);
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando pagina";
    }

    @Override
    public String tocar() {
        if (musicaSelecionada == null) {
            return "Nenhuma musica selecionada.";
        } else {
            if (tocandoMusica) {
                return String.format("%s já está tocando.", musicaSelecionada);
            } else {
                return String.format("%s está tocando.", musicaSelecionada);
            }
        }
    }

    @Override
    public String pausar() {
        if (musicaSelecionada == null){
            return "Nenhuma musica selecionada.";
        } else {
            if (tocandoMusica) {
                return String.format("%s pausada.", musicaSelecionada);
            }
            else {
                return String.format("%s não está tocando.", musicaSelecionada);
            }
        }
    }

    @Override
    public String selecionarMusica(String musica) {
        musicaSelecionada = musica;
        return String.format("%s selecionado.",musica);
    }
}
