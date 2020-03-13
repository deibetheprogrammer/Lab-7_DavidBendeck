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
public class Admin extends Usuario implements Serializable{

    public Admin() {
    }

    public Admin(String nickname, String password, String name) {
        super(nickname, password, name);
    }
    
}
