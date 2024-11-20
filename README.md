# Bliss-Challenge
Uma aplicação Android desenvolvida como parte de um desafio técnico para a vaga de Desenvolvedor Android Jr. O objetivo é criar um aplicativo que realiza uma consulta em uma API de Emojis e uma de Avatar do GitHub. O desafio consiste em criar um botão que traz um emoji aleatório a tela, um botão que retornar uma lista com todos os emojis, um campo de busca que traz o avatar de acordo com o usuário digitado, um botão que retornar uma lista de Avatars e um botão que traz um lista com todos os Google Repos.

## :camera_flash: Screenshots
![Imagem do WhatsApp de 2024-11-20 à(s) 15 47 48_5c52ca8e](https://github.com/user-attachments/assets/ec5ec55e-6ebf-40ed-86dd-061796342008) ![Imagem do WhatsApp de 2024-11-20 à(s) 15 47 48_3d0a7e14](https://github.com/user-attachments/assets/88aaaefe-09dc-4f8a-a71d-d2836b6596e8)


## :hammer_and_wrench: Tecnologias
* **Linguagem:** Kotlin
* **Arquitetura:** MVVM e Koin
* **Bibliotecas utilizadas:**
    * Jetpack Compose
    * Ktor para consumo de APIs
    * Room para persistência de dados
    * Koin para injeção de dependências (se aplicável)
    * Navegate para nevegação entre telas
 
## :rocket: Funcionalidades
* **Random Emoji:** Um emoji aleatório é mostrado na tela inicial do aplicatico sempre que o botão "Random Emoji" é clicado.
* **Emoji List:** Uma lista de emojis é carregada na tela sempre que o botão "Random Emoji" é clicado.

## :open_file_folder: Estrutura do Projeto

```
/app
  /data            -> Camada de dados
  /database        -> Camada de configuração do banco de dados
  /presentation    -> Camada de apresentação
````
## :package: Estrutura do Projeto

1. Clone o repositório:
```
git clone https://github.com/Mxflea/Bliss-Challenge.git
```
3. Abra o projeto no Android Studio.
4. Baixe as dependências do Gradle.
5. Execute o aplicativo no emulador ou dispositivo físico.

## :pencil: Testes
* Testes ainda não realizados.

## :bulb: Melhorias Futuras
* Melhorar a interface do usuário.
* Habilitar o campo de busca de Avatar por usuário do GitHub.
* Habilitar o botão "Avatar List".
* Habiilitar o botão "Google Repos".

## :scroll: Licença
Projeto realziado para fins de avaliação.
