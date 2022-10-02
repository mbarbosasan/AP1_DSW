package com.example.ap1_dsw.Model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Hobbie> listaDeHobbies = new ArrayList<>();

    public BancoDeDados () {};

    public List<Hobbie> getListaDeHobbies() {
        return listaDeHobbies;
    }

    public void addListaDeHobbies(Hobbie hobbie) {
        this.listaDeHobbies.add(hobbie);
    }
}
