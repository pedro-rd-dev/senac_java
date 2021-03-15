package com.senac.exercicios;

public class Exercicio06 {

    public static void main(String[] args) {
        int idade  = 18;
        boolean brasileiro = true;
        boolean temDisponibilidadeTarde = true;

        cadastrar(idade,brasileiro,temDisponibilidadeTarde);

    }

    private static void cadastrar(int idade, boolean brasileiro, boolean temDisponibilidadeTarde) {
        if(verificarMaiorIdade(idade)){
            if(verificarDisponibilidadeTarde(temDisponibilidadeTarde)){
                if(verificarNacionalidade(brasileiro)){
                    System.out.println("Parabens cadastro realizado");
                }else {
                    System.out.println("Não foi possivel cadastrar");
                }
            }
        }

    }

    private static boolean verificarDisponibilidadeTarde(boolean temDisponibilidadeTarde) {
        if(temDisponibilidadeTarde){
            System.out.println("Tem disponibilidade a tarde");
            return true;
        }else {
            System.out.println("Não tem disponibilidade a tarde");
            return false;
        }
    }

    private static boolean verificarNacionalidade(boolean brasileiro) {
        if(brasileiro){
            System.out.println("É BRASILEIRO");
            return true;
        }else {
            System.out.println("Não é BRASILEIRO");
            return false;
        }
    }

    private static boolean verificarMaiorIdade(int idade) {
         if(idade >= 18 ){
             System.out.println("É MAIOR DE IDADE");
             return true;

         }else {
             System.out.println("Não é MAIOR DE IDADE");
             return false;
         }
    }
}
