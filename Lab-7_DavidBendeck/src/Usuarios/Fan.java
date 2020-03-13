/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import lab.pkg7_davidbendeck.Evento;

/**
 *
 * @author davidbendeck
 */
public class Fan extends Usuario implements Serializable{
    
    private ArrayList<Evento> eventos = new ArrayList<>();
    private ArrayList<Artista> artistas = new ArrayList<>();

    public Fan() {
    }

    public Fan(String nickname, String password, String name) {
        super(nickname, password, name);
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    
}
