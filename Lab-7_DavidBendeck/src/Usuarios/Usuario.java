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
public class Usuario implements Serializable{
    
    protected String nickname;
    protected String password;
    protected String name;

    public Usuario() {
    }

    public Usuario(String nickname, String password, String name) {
        this.nickname = nickname;
        this.password = password;
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    
}
