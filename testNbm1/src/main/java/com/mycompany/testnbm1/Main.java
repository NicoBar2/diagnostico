/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testnbm1;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Elementos de un aula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        JTextField colorPizarraField = new JTextField(20);
        JLabel colorPizarraLabel = new JLabel("Color de la pizarra:");
        JPanel colorPizarraPanel = new JPanel();
        colorPizarraPanel.add(colorPizarraLabel);
        colorPizarraPanel.add(colorPizarraField);
        
        JTextField colorSillaField = new JTextField(20);
        JLabel colorSillaLabel = new JLabel("Color de la silla:");
        JPanel colorSillaPanel = new JPanel();
        colorSillaPanel.add(colorSillaLabel);
        colorSillaPanel.add(colorSillaField);
        
        JTextField colorMesaField = new JTextField(20);
        JLabel colorMesaLabel = new JLabel("Color de la mesa:");
        JPanel colorMesaPanel = new JPanel();
        colorMesaPanel.add(colorMesaLabel);
        colorMesaPanel.add(colorMesaField);
        
        JTextField modeloComputadoraField = new JTextField(20);
        JLabel modeloComputadoraLabel = new JLabel("Modelo de la computadora:");
        JPanel modeloComputadoraPanel = new JPanel();
        modeloComputadoraPanel.add(modeloComputadoraLabel);
        modeloComputadoraPanel.add(modeloComputadoraField);
        
        JTextField modeloMouseField = new JTextField(20);
        JLabel modeloMouseLabel = new JLabel("Modelo del mouse:");
        JPanel modeloMousePanel = new JPanel();
        modeloMousePanel.add(modeloMouseLabel);
        modeloMousePanel.add(modeloMouseField);
        
        JButton mostrarResultadoButton = new JButton("Mostrar resultado");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mostrarResultadoButton);
        
        frame.add(colorPizarraPanel);
        frame.add(colorSillaPanel);
        frame.add(colorMesaPanel);
        frame.add(modeloComputadoraPanel);
        frame.add(modeloMousePanel);
        frame.add(buttonPanel);
        
        frame.setVisible(true);
        
        mostrarResultadoButton.addActionListener(e -> {
            String colorPizarra = colorPizarraField.getText();
            String colorSilla = colorSillaField.getText();
            String colorMesa = colorMesaField.getText();
            String modeloComputadora = modeloComputadoraField.getText();
            String modeloMouse = modeloMouseField.getText();
            
            Pizarra pizarra = new Pizarra(colorPizarra);
            Silla silla = new Silla(colorSilla);
            Mesa mesa = new Mesa(colorMesa);
            Computadora computadora = new Computadora(modeloComputadora);
            Mouse mouse = new Mouse(modeloMouse);
            
            StringBuilder resultado = new StringBuilder();
            resultado.append("Datos ingresados:\n");
            resultado.append("Color de la pizarra: ").append(pizarra.obtenerColor()).append("\n");
            resultado.append("Color de la silla: ").append(silla.obtenerColor()).append("\n");
            resultado.append("Color de la mesa: ").append(mesa.obtenerColor()).append("\n");
            resultado.append("Modelo de la computadora: ").append(computadora.modelo).append("\n");
            resultado.append("Modelo del mouse: ").append(mouse.modelo).append("\n");
            JOptionPane.showMessageDialog(null, resultado.toString());
            
            pizarra.realizarAccion();
            silla.realizarAccion();
            mesa.realizarAccion();
            computadora.realizarAccion();
            mouse.realizarAccion();
        });
    }
}


