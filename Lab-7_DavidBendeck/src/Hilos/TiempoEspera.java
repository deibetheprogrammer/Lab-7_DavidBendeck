/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author davidbendeck
 */
public class TiempoEspera extends Thread {
    
    private JProgressBar barra;
    private JDialog dialog;
    private boolean avanzar;
    private boolean vive;
    private int tiempo;
    
    public TiempoEspera(JProgressBar barra,JDialog dialog, int tiempo) {
        this.barra = barra;
        barra.setMaximum(tiempo);
        this.dialog = dialog;
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
        barra.setValue(0);
        while(vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                //System.out.println(barra.getValue());
                //System.out.println(tiempo);
                if (barra.getValue() >= tiempo) {
                    vive = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    
                }
            }
        }
        dialog.setVisible(false);
    }
    
}
