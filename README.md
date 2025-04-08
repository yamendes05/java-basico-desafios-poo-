
# Desafios de POO em Java: Funcionalidades do iPhone

Este projeto apresenta uma modelagem orientada a objetos das principais funcionalidades de um iPhone, incluindo:

- **Reprodutor Musical**: Capacidade de reproduzir músicas.
- **Aparelho Telefônico**: Capacidade de realizar e receber chamadas telefônicas.
- **Navegador na Internet**: Capacidade de navegar na web.

## Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- **Interfaces**: Definem os comportamentos esperados para cada funcionalidade.
  - `ReprodutorMusical`: Interface que define métodos relacionados à reprodução de músicas.
  - `AparelhoTelefonico`: Interface que define métodos para operações telefônicas.
  - `NavegadorInternet`: Interface que define métodos para navegação na web.

- **Classe `iPhone`**: Implementa as três interfaces acima, consolidando as funcionalidades em um único dispositivo.

## Diagrama de Classes

![image](https://github.com/user-attachments/assets/09d05419-4988-4694-8281-2cdf94c584cd)

## Funcionalidades
- **Reprodutor Musical**:

-`tocar()`: Inicia a reprodução de uma música.

- `pausar()`: Pausa a música em reprodução.

- `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.

- **Aparelho Telefônico**:

- `ligar(String numero)`: Realiza uma chamada para o número especificado.

- `atender()`: Atende uma chamada recebida.

- `iniciarCorreioVoz()`: Inicia o correio de voz.

- **Navegador na Internet**:

- `exibirPagina(String url)`: Exibe a página da web correspondente ao URL fornecido.

- `adicionarNovaAba()`: Abre uma nova aba no navegador.

- `atualizarPagina()`: Atualiza a página atual.
