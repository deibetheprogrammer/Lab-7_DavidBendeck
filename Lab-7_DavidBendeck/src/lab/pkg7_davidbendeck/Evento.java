/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_davidbendeck;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author davidbendeck
 */
public class Evento implements Serializable{
    
    private Date fecha;
    private String ciudad;
    private String lugar;
    private int capacidad;
    private ArrayList<Cancion> setlist = new ArrayList<>();

    public Evento() {
    }

    public Evento(Date fecha, String ciudad, String lugar, int capacidad) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Cancion> getSetlist() {
        return setlist;
    }

    public void setSetlist(ArrayList<Cancion> setlist) {
        this.setlist = setlist;
    }

    @Override
    public String toString() {
        return lugar;
    } 
    
}
