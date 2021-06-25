/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Armando
 */
public class Herencia {
    public static void main(String[] args) {
        Alumno alum1 = new Alumno("318019752", "Ing. en computación", 2, "Eiram Diego", 19, 1, 1.75f);
        System.out.println(alum1);
        Persona person1 = new Persona("Eiram Diego", 19, 1, 1.75f);
        System.out.println(person1);
    }
}
