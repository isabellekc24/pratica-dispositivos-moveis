package com.example.listaplanetas;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> planetas;

    public PlanetaDAO() {
        planetas = new ArrayList<>();
        planetas.add(new Planeta("sol",R.drawable.sun));
        planetas.add(new Planeta("mercurio",R.drawable.mercury));
        planetas.add(new Planeta("venus",R.drawable.venus));
        planetas.add(new Planeta("Terra",R.drawable.earth));
        planetas.add(new Planeta("marte",R.drawable.mars));
        planetas.add(new Planeta("jupter",R.drawable.jupter));
        planetas.add(new Planeta("saturno",R.drawable.saturn));
        planetas.add(new Planeta("urano",R.drawable.uranus));
        planetas.add(new Planeta("netuno",R.drawable.neptune));
    }
    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }
}
