package com.senac.models;

public class Usuario {

    public void verficarIdade(int idade){

        if(idade >=18){
            System.out.println("É maior de idade");
        }else {
            System.out.println("Não é maior de idade");
        }
    }
}
