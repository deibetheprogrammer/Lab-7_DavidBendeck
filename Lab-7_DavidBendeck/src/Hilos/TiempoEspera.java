/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import javax.swing.JProgressBar;

/**
 *
 * @author davidbendeck
 */
public class TiempoEspera extends Thread {
    
 private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int tiempo;
    
    public TiempoEspera(JProgressBar barra, int tiempo) {
        this.barra = barra;
        this.tiempo = tiempo;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        while(vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() >= tiempo) {
                    vive = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    
                }
            }
        }
    }
    
}
