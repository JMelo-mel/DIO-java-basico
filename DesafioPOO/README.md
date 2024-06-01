
classDiagram
    ReprodutorMusical <|-- IPhone
    AparelhoEletronico <|-- IPhone
    NavegadorInternet <|-- Iphone

    class IPhone{}

    class ReprodutorMusical{
        -tocar()
        -pausar()
        -selecionarMusica(String Musica)
    }

    class AparelhoEletronico{
        -ligar(String numero)
        -atender()
        -iniciarCorreioVoz()
    }

    class NavegadorInternet {
        -exibirPagina(String url)
        -adicionarNovaAba()
        -atualizarPagina
    }
