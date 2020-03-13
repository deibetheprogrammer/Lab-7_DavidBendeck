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
public class Banda extends Artista implements Serializable{
    
    private int integrantes;

    public Banda() {
    }

    public Banda(int integrantes, String genero, String nickname, String password, String name) {
        super(genero, nickname, password, name);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    
}
