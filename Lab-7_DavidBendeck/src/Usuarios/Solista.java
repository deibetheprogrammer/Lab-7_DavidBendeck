/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.Serializable;

/**
 *
 * @author davidbendeck
 */
public class Solista extends Artista implements Serializable{
    
    private int edad;

    public Solista() {
    }

    public Solista(int edad, String genero, String nickname, String password, String name) {
        super(genero, nickname, password, name);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    
}
