/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import ico.fes.CPU.CPU;
import ico.fes.CPU.Monitor;
import ico.fes.CPU.Mouse;
import ico.fes.CPU.Teclado;
import ico.fes.composición.Computadora;

/**
 *
 * @author Armando
 */
public class PruebasComputadora {
    public static void main(String[] args) {
        Computadora c1 =new Computadora();
        c1.setMarcaComputadora("Lenovo");
        c1.setModeloComputadora("Yoga 7");
        System.out.println(c1.getModeloComputadora());
        System.out.println(c1.getMarcaComputadora());
        c1.setMoni(new Monitor("HP", "X1342", 17.8f));
        System.out.println(c1.getMoni());
        c1.setMou(new Mouse("Logitech", "g203", "optico"));
        System.out.println(c1.getMou());
        c1.setTecla(new Teclado("hypex", "BINDEN", 61, 8));
        System.out.println(c1.getTecla());
        c1.setCpu(new CPU("Ryzen 5", "3600", 3.6f));
        System.out.println(c1.getCpu());
        
        
        
        
        
        
        
        
        
        
        
    }
}
