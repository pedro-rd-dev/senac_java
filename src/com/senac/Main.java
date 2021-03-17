package com.senac;

import com.senac.models.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(17,true,true);

        System.out.println(usuario.getDisponibilidade());

        //usuario.cadastrar(19,true,true);

    }
}
