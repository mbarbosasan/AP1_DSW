package com.example.ap1_dsw.Model;

import java.util.Date;

public class Hobbie {
    private String hobbie;
    private String horario;

    public Hobbie (String hobbie, String horario) {
        this.hobbie = hobbie;
        this.horario = horario;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Hobbie{" +
                "hobbie='" + hobbie + '\'' +
                ", horario=" + horario +
                '}';
    }
}
