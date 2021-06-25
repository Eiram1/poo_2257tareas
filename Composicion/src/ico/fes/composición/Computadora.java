/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.composición;

import ico.fes.CPU.CPU;
import ico.fes.CPU.Monitor;
import ico.fes.CPU.Mouse;
import ico.fes.CPU.Teclado;

/**
 *
 * @author Armando
 */
public class Computadora {
    private String marcaComputadora;
    private String modeloComputadora;
    private Teclado tecla;
    private Monitor moni;
    private Mouse mou;
    private CPU cpu;

    public Computadora() {
    }

    public Computadora(String marcaComputadora, String modeloComputadora, Teclado tecla, Monitor moni, Mouse mou, CPU cpu) {
        this.marcaComputadora = marcaComputadora;
        this.modeloComputadora = modeloComputadora;
        this.tecla = tecla;
        this.moni = moni;
        this.mou = mou;
        this.cpu = cpu;
    }

    public String getMarcaComputadora() {
        return marcaComputadora;
    }

    public void setMarcaComputadora(String marcaComputadora) {
        this.marcaComputadora = marcaComputadora;
    }

    public String getModeloComputadora() {
        return modeloComputadora;
    }

    public void setModeloComputadora(String modeloComputadora) {
        this.modeloComputadora = modeloComputadora;
    }

    public Teclado getTecla() {
        return tecla;
    }

    public void setTecla(Teclado tecla) {
        this.tecla = tecla;
    }

    public Monitor getMoni() {
        return moni;
    }

    public void setMoni(Monitor moni) {
        this.moni = moni;
    }

    public Mouse getMou() {
        return mou;
    }

    public void setMou(Mouse mou) {
        this.mou = mou;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}