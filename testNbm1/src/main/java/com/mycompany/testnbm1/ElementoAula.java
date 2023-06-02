/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testnbm1;

/**
 *
 * @author nicol
 */
import javax.swing.*;

class ElementoAula {
    protected String color;
    
    public ElementoAula(String color) {
        this.color = color;
    }
    
    public String obtenerColor() {
        return color;
    }
    
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "Realizando acción en el elemento del aula.");
    }
}

class Pizarra extends ElementoAula {
    public Pizarra(String color) {
        super(color);
    }
    
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "La pizarra está lista para escribir.");
    }
}

class Silla extends ElementoAula {
    public Silla(String color) {
        super(color);
    }
    
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "La silla está lista para sentarse.");
    }
}

class Mesa extends ElementoAula {
    public Mesa(String color) {
        super(color);
    }
    
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "La mesa está lista para colocar objetos.");
    }
}

class Computadora extends ElementoAula {
    String modelo;
    
    public Computadora(String modelo) {
        super(null); 
        this.modelo = modelo;
    }
    
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "La computadora modelo " + modelo + " está encendida.");
    }
}

class Mouse extends ElementoAula {
    String modelo;
    
    public Mouse(String modelo) {
        super(null); 
        this.modelo = modelo;
    }
    
    @Override
    public void realizarAccion() {
        JOptionPane.showMessageDialog(null, "El mouse modelo " + modelo + " ha hecho clic.");
    }
}

