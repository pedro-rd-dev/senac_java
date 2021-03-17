package com.senac.models;

public class Usuario {

    private int idade;
    private boolean nacionalidade;
    private boolean disponibilidade;

    public Usuario() {
    }

    public Usuario(int idade, boolean nacionalidade, boolean disponibilidade) {
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.disponibilidade = disponibilidade;
    }

    public Usuario(int idade, boolean nacionalidade) {
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

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
                }
            }
        }
        System.out.println("PARABENS VOCE não CADASTROU");
        return false;
    }

    public int getIdade() {
        return idade + 10;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(boolean nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
