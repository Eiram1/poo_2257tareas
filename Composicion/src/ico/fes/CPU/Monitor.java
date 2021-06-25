/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.CPU;

/**
 *
 * @author Armando
 */
public class Monitor {
    private String marca;
    private String modelo;
    private float tamanio;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, float tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", tamanio=" + tamanio + '}';
    }
    
    public boolean encender(){
        System.out.println("Encendiendo el equipo" + this.marca);
        return true;
    }
}
