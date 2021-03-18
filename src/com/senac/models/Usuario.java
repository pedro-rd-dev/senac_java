package com.senac.models;

public class Usuario {
    private int idade;
    private String nome;
    private Endereco endereco;



    public void cadastrar() {
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
