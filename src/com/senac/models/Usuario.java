package com.senac.models;

public class Usuario {

    public boolean verficarIdade(int idade){

        if(idade >=18){
            System.out.println("É maior de idade");
            return true;
        }else {
            System.out.println("Não é maior de idade");
            return false;
        }
    }

    public boolean verificarNacionalidade(boolean nacionalidade) {
        if(nacionalidade){
            System.out.println("É BRASILEIRO");
            return true;
        }else {
            System.out.println("NÃO É BRASILEIRO");
            return false;
        }
    }

    public boolean verificarDisponibilidade(boolean disponibilidade) {
        if(disponibilidade){
            System.out.println("tem disponibilidada");
            return true;
        }else {
            System.out.println("Não tem disponibilidada");
            return false;
        }
    }

    public boolean cadastrar(int idade,boolean nacionalidade,boolean disponibilidade) {
        if(verficarIdade(idade)){
            if(verificarNacionalidade(nacionalidade)){
                if(verificarDisponibilidade(disponibilidade)){
                    System.out.println("PARABENS VOCE CADASTROU");
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
