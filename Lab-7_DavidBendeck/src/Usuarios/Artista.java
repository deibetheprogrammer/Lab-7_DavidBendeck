/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import lab.pkg7_davidbendeck.Cancion;

/**
 *
 * @author davidbendeck
 */
public class Artista extends Usuario implements Serializable{
    
    protected String genero;
    protected ArrayList<Cancion> canciones = new ArrayList<>();

    public Artista() {
    }

    public Artista(String genero, String nickname, String password, String name) {
        super(nickname, password, name);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
}
