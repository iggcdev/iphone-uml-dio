# Iphone - Desafio de Codigo Dio.me - Java

A classe `Iphone` implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Ela simula um iPhone com funcionalidades de reprodução de música, chamadas telefônicas e navegação na internet.

![Diagrama UML Iphone][assets/iphoneClassUmlJava.png]
### Métodos

#### ReprodutorMusical

- `tocar()`: Toca a música selecionada.
- `pausar()`: Pausa a reprodução da música.
- `selecionarMusica(String musica)`: Seleciona uma música para reprodução.

#### AparelhoTelefonico

- `ligar(String num)`: Realiza uma ligação para o número especificado.
- `atenderLigacao(String num)`: Atende a uma chamada recebida.
- `iniciarCorreioDeVoz(String msg, String num)`: Inicia o correio de voz e envia uma mensagem para o número especificado.

#### NavegadorInternet

- `exibirPagina(String url)`: Exibe a página da web no navegador.
- `atualizarPagina()`: Atualiza a página da web atual.
- `adicionarNovaAba(String url)`: Adiciona uma nova aba com a página da web especificada.

### Exemplo de Uso

```java
public static void main(String[] args) {
    Iphone iphone = new Iphone();
    System.out.println(iphone.selecionarMusica("Pink Floyd - Time"));
    System.out.println(iphone.tocar());
    System.out.println(iphone.pausar());

    System.out.println(iphone.ligar("12345678"));
    System.out.println(iphone.atenderLigacao("778899"));
    System.out.println(iphone.iniciarCorreioDeVoz("Ola, voce esta ai?","998877"));

    System.out.println(iphone.exibirPagina("google.com"));
    System.out.println(iphone.atualizarPagina());
    System.out.println(iphone.adicionarNovaAba("x.com"));
}

