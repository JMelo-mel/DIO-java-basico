---
title: IPhone 2007
---
classDiagram
    IPhone --|> ReprodutorMusical 
    IPhone --|> AparelhoEletronico 
    IPhone --|> NavegadorInternet 
    
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
        -atualizarPagina()
    }
