package com.senac;

import com.senac.models.Endereco;
import com.senac.models.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setNome("PEDRO");
        usuario.setIdade(17);

        Endereco endereco = new Endereco();
        endereco.setNumero("201");
        endereco.setBairro("Novo mexico");
        endereco.setRua("Sesquicentenario");

        usuario.setEndereco(endereco);

        usuario.cadastrar();

    }




}
