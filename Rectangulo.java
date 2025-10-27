/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.constructores;

/**
 *
 * @author labesp
 */
public class Rectangulo {
   private int ancho;
   private int altura;

    public Rectangulo (int ancho, int altura){
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public Rectangulo (int lado){
        this.ancho = lado;
        this.altura = lado;
    }
    
    public int getAncho(){
        return ancho;
    }
    
    public int getAltura(){
        return altura;
    }
}
