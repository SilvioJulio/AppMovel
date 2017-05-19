package com.example.sivic.myappmovel;

/**
 * Created by alan on 18/05/17.
 */
public class Lami {

    private int id;

    private int[] horariosManha;
    private int[] horariosNoite;

    public Lami() {
    }

    public Lami(int id, int[] horariosManha, int[] horariosNoite) {
        super();
        this.id = id;
        this.horariosManha = horariosManha;
        this.horariosNoite = horariosNoite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getHorariosManha() {
        return horariosManha;
    }

    public void setHorariosManha(int[] horariosManha) {
        this.horariosManha = horariosManha;
    }

    public int[] getHorariosNoite() {
        return horariosNoite;
    }

    public void setHorariosNoite(int[] horariosNoite) {
        this.horariosNoite = horariosNoite;
    }

    @Override
    public String toString() {
        return "Lami " + id;
    }
}
